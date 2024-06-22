package com.fakerest.tests;

import com.fakerest.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deletebyid extends BaseTest {

    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse ;
    @Test
    public void deletebyid(){
        validatableresponse=given().delete("/1").then().log().all().statusCode(200);
    }
}
