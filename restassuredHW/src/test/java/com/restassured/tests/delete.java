package com.restassured.tests;

import com.restassured.testBase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class delete extends TestBase {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableresponse;

    @Test
    public void deleteproductbyidsimple(){
        given()
                .when()
                .delete("/products/9999689")
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void deleteproductbyid(){
        requestSpecification=given();
        response=requestSpecification.delete("/products/9999689");
        validatableresponse=response.then().log().all().statusCode(200);
        validatableresponse.toString();



    }
}
