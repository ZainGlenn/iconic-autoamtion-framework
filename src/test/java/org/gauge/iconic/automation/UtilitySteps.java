package org.gauge.iconic.automation;

import org.assertj.core.api.Assertions;
import org.gauge.iconic.utils.rest.ResponseEntity;

public class UtilitySteps {

    public static void checkResponse(ResponseEntity responseEntity) {
        if (!responseEntity.isSuccessful()) {
            Assertions.fail("Failed to validate response is successful - code ( " + responseEntity.getCode() + ") -" + responseEntity.getResponse());
        }
    }


}
