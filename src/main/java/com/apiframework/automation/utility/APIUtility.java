package com.apiframework.automation.utility;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public interface APIUtility {
    default Response GET(String endpoint) {
        Response response= RestAssured.when().get(endpoint).then().extract().response();
        return response;
    }
}
