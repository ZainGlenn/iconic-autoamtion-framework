package org.gauge.iconic.automation.product;

import org.gauge.iconic.automation.UtilitySteps;
import org.gauge.iconic.exception.IconicRuntimeException;
import org.gauge.iconic.utils.TestSettings;
import org.gauge.iconic.utils.rest.ResponseEntity;
import org.gauge.iconic.utils.rest.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;

public class ProductPage {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    private final RestClient restClient;

    public ProductPage() {
        TestSettings testSettings = TestSettings.getInstance();
        this.restClient = new RestClient(testSettings.getProperty("site.url"));
    }

    public ResponseEntity getProducts(HashMap<String, String> parameters) {
        //convert product parameter to map
        String endpoint = ProductEndpoint.getCatalogProducts(parameters);
        try {
            ResponseEntity responseEntity = restClient.apiGet(endpoint);
            UtilitySteps.checkResponse(responseEntity);
            return responseEntity;
        } catch (IOException e) {
            log.error("Failed to get products - " + e.getMessage(), new Throwable(e));
            throw new IconicRuntimeException("Failed to get products - " + e.getMessage(), new Throwable(e));
        }

    }

}
