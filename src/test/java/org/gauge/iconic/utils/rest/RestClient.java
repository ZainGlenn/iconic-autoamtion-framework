package org.gauge.iconic.utils.rest;

import okhttp3.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RestClient {
    private final Logger logger;
    private final OkHttpClient client;
    private final String url;

    public RestClient(String url) {
        this.logger = LogManager.getLogger(RestClient.class);
        this.url = url;
        this.client = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(5, TimeUnit.MINUTES) // write timeout
                .readTimeout(5, TimeUnit.MINUTES) // read timeout
                .build();
    }

    public ResponseEntity apiGet(String apiEndpoint) throws IOException {
        logger.info("apiGet -> " + apiEndpoint);
        return requestBuilder(apiEndpoint, null, RequestType.GET);
    }

    public ResponseEntity apiPost(String apiEndpoint, String payload) throws IOException {
        logger.info("apiPost ->" + apiEndpoint);
        return requestBuilder(apiEndpoint, payload, RequestType.POST);
    }

    public ResponseEntity apiPut(String apiEndpoint, String payload) throws IOException {
        logger.info("apiPost -> " + apiEndpoint);
        return requestBuilder(apiEndpoint, payload, RequestType.PUT);
    }


    private ResponseEntity requestBuilder(String apiEndpoint, String payload, RequestType requestType) throws IOException {
        Request.Builder requestBuilder = new Request.Builder()
                .url(urlCreator(apiEndpoint));
        Request request;
        if (requestType.equals(RequestType.GET)) {
            request = requestBuilder.method(requestType.toString(), null)
                    .build();
        } else {
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), payload);
            request = requestBuilder.method(requestType.toString(), requestBody)
                    .build();
        }
        return requestRunner(request);
    }

    private String urlCreator(String endpoint) {
        return String.format("%s%s", url, endpoint);
    }


    private ResponseEntity requestRunner(Request request) throws IOException {
        int RETRY_COUNT = 3;
        int SLEEP_TRY_IN_MS = 500;
        for (int count = 0; count < RETRY_COUNT; count++) {
            try {
                Response response = client.newCall(request).execute();
                return getResponse(response);
            } catch (Exception e) {
                logger.error("Error processing request -> " + e.getMessage(), e);
                pause(SLEEP_TRY_IN_MS);
            }
        }
        logger.error("Request failed to complete for -> " + request.url().host());
        throw new IOException("Request Failed to complete");
    }

    private ResponseEntity getResponse(Response response) throws IOException {
        ResponseBody responseBody = response.body();
        String myRes = null;
        if (responseBody != null) {
            myRes = responseBody.string();
        }
        return new ResponseEntity(response.isSuccessful(), response.code(), myRes);
    }

    private void pause(int sleepMS) {
        try {
            TimeUnit.MILLISECONDS.sleep(sleepMS);
        } catch (InterruptedException exception) {
            logger.error("Sleep interrupted -> " + exception.getMessage(), exception);
        }
    }

    public enum RequestType {
        POST, PUT, GET
    }
}
