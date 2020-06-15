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
        String URL="https://corona-virus-stats.herokuapp.com/api/v1/cases/general-stats";
        Header header = null;
        Response response= GET(URL);
        Assert.assertEquals(response.statusCode(),200);
        System.out.println(response.asString());
        System.out.println("success");

    }


}
