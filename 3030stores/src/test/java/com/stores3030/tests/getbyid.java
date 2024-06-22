package com.stores3030.tests;

import com.stores3030.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getbyid extends BaseTest {
    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse;
    @Ignore
    @Test
    public void getstorebyidsimple(){
        given()
                .when()
                .get("/stores/8924")
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void getstorebyID(){
        requestspecification=given();
        response=requestspecification.get("/stores/8924");
        validatableresponse=response.then().log().all().statusCode(200);
    }
}
