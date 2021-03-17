package org.gauge.iconic.automation.product;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import org.gauge.iconic.automation.product.entities.CatalogSchema;
import org.gauge.iconic.utils.GaugeTable;
import org.gauge.iconic.utils.NumericalListValidator;
import org.gauge.iconic.utils.TextListValidator;
import org.gauge.iconic.utils.rest.ResponseEntity;
import org.hamcrest.MatcherAssert;

import java.util.HashMap;
import java.util.List;

public class ProductSteps {
    private final ProductPage productPage;

    public ProductSteps() {
        this.productPage = new ProductPage();
    }

    @Step("Run products request filtered by query <table>")
    public void runRequest(Table table) {
        GaugeTable params = new GaugeTable(table);
        HashMap<String, String> paramsMapped = params.tableToMap();
        ScenarioDataStore.put("params", paramsMapped);
        ResponseEntity responseEntity = productPage.getProducts(paramsMapped);
        CatalogSchema catalog = ProductProcessor.getCatalogSchema(responseEntity);
        ScenarioDataStore.put("catalog", catalog);
    }

    @Step("Validate response does not have gender <gender> in response")
    public void validateGenderInResponse(String gender) {
        CatalogSchema catalog = (CatalogSchema) ScenarioDataStore.get("catalog");
        new TextListValidator(ProductProcessor.getPatientGender(catalog))
                .validateListIsNotEmpty()
                .validateThereAreNoMatchesFor("Gender", gender);
        //add check to iterate through all product pages
    }

    @Step("Validate response relates to search query provided <boots>")
    public void validateSearchQueryRelationInResponse(String relation) {
        CatalogSchema catalog = (CatalogSchema) ScenarioDataStore.get("catalog");
        new TextListValidator(ProductProcessor.getTranslatedCategories(catalog))
                .validateListIsNotEmpty()
                .validateThatAllValuesHaveMatchesFor("Categories Translated", relation);
        //add check to iterate through all product pages
    }

    @Step("Validate response does not relate to search query <table>")
    public void validateResponseDoesNotRelateTo(Table table) {
        CatalogSchema catalog = (CatalogSchema) ScenarioDataStore.get("catalog");
        GaugeTable gt = new GaugeTable(table);
        List<String> criteria = gt.getKeyListFromGaugeTable();
        new TextListValidator(ProductProcessor.getTranslatedCategories(catalog))
                .validateListIsNotEmpty()
                .validateThatAllValuesHaveNoMatchesFor("Categories Translated", criteria);
    }


    @Step("Validate no free items are list in response")
    public void validateNoFreeItemsInResponse() {
        CatalogSchema catalog = (CatalogSchema) ScenarioDataStore.get("catalog");
        new NumericalListValidator(ProductProcessor.getFinalPrice(catalog))
                .validateNotEmpty()
                .validateNoItemsAreZero();
        //add check to iterate through all product pages
    }

    @Step("Validate page size matches matches product response size of <10>")
    public void validatePageSizeProvidesResponseSize(String size) {
        CatalogSchema catalog = (CatalogSchema) ScenarioDataStore.get("catalog");
        boolean matchesResponseOutput = catalog.getPageSize().equals(Integer.parseInt(size));
        MatcherAssert.assertThat(String.format("Failed to validate size matches response 'Page Size' got '%s' expected '%s'", catalog.getPageSize(), size), matchesResponseOutput);
        boolean matchesProductSizeList = catalog.getEmbedded().getProduct().size() == Integer.parseInt(size);
        MatcherAssert.assertThat("Failed to validate size matches product list length", matchesProductSizeList);
        //add check to iterate through all product pages
    }

    @SuppressWarnings("unchecked")
    @Step("Create and validate response has specified search criteria <table>")
    public void validateResponseHasSpecifiedSearchCriteria(Table table) {
        GaugeTable gt = new GaugeTable(table);
        List<String> criteriaList = gt.getKeyListFromGaugeTable();
        for (String criteria : criteriaList) {
            HashMap<String, String> paramsMapped = (HashMap<String, String>) ScenarioDataStore.get("params");
            paramsMapped.put("q", criteria);
            ResponseEntity responseEntity = productPage.getProducts(paramsMapped);
            CatalogSchema catalog = ProductProcessor.getCatalogSchema(responseEntity);
            new TextListValidator(ProductProcessor.getTranslatedCategories(catalog))
                    .validateListIsNotEmpty()
                    .validateThatAllValuesHaveMatchesFor("Categories Translated", criteria);
        }

        //add check to iterate through all product pages
    }
}
