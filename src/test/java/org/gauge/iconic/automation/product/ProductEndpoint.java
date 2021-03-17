package org.gauge.iconic.automation.product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class ProductEndpoint {
    public static String getCatalogProducts(HashMap<String, String> parameterMap) {
        return String.format("/catalog/products%s", createParameters(parameterMap));
    }

    public static String createParameters(HashMap<String, String> parameterMap) {
        StringBuilder stringBuilder = new StringBuilder();

        Iterator<String> keys = parameterMap.keySet().stream().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = parameterMap.get(key);
            if (!Objects.isNull(value)) {
                stringBuilder.append(String.format("%s=%s&", key, value));
            }
        }
        if (stringBuilder.length() < 0) {
            return null;
        }
        return stringBuilder.insert(0, "?").deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
