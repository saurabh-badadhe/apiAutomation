package com.apiframework.automation.test;

import com.apiframework.automation.utility.APIUtility;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest implements APIUtility {

    @Test
    public void testGetApi()
    {
        String URL="https://www.google.com/";
        Header header = null;
        Response response= GET(URL);
        Assert.assertEquals(response.statusCode(),200);
        System.out.println(response.asString());
        System.out.println("success");

    }


}
