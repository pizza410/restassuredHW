package com.restassured.tests;

import com.restassured.testBase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getbyid extends TestBase {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void getproductsbyidsimple(){
        given()
                .when()
                .get("/products/9999689")
                .then().log().all()
                .statusCode(200);
    }

    @Test
    public void getproductsbyid(){
        requestSpecification=given();
        response=requestSpecification.get("/products/9999689");
        validatableResponse=response.then().log().all().statusCode(200);

    }
}
