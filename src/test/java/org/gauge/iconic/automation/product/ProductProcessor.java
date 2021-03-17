package org.gauge.iconic.automation.product;

import com.google.gson.Gson;
import org.gauge.iconic.automation.product.entities.CatalogSchema;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.Product;
import org.gauge.iconic.utils.rest.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductProcessor {
    private static final Gson gson = new Gson();

    public static CatalogSchema getCatalogSchema(ResponseEntity responseEntity) {
        return gson.fromJson(responseEntity.getResponse(), CatalogSchema.class);
    }

    public static List<String> getPatientGender(CatalogSchema catalogSchema) {
        List<Product> productList = catalogSchema.getEmbedded().getProduct();
        return productList.stream().map(p -> p.getEmbedded().getGender().getName()).collect(Collectors.toList());
    }

    public static List<String> getTranslatedCategories(CatalogSchema catalogSchema) {
        List<Product> productList = catalogSchema.getEmbedded().getProduct();
        return productList.stream().map(p -> p.getCategoriesTranslated().toLowerCase()).collect(Collectors.toList());
    }

    public static List<Float> getFinalPrice(CatalogSchema catalogSchema) {
        List<Product> productList = catalogSchema.getEmbedded().getProduct();
        return productList.stream().map(Product::getFinalPrice).collect(Collectors.toList());
    }
}
