package com.fakerest.tests;

import com.fakerest.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class findByid extends BaseTest {
    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse ;
    @Test
    public void finduserbyID(){
        requestspecification=given();
        response=requestspecification.get("/5");
        validatableresponse=response.then().log().all().statusCode(200);
    }
}
