package com.stores3030.tests;

import com.stores3030.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class getstorelist extends BaseTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Ignore
    @Test
    public void getstorelistsimple(){
        given()
                .when()
                .get("/stores")
                .then().log().all()
                .statusCode(200)
                .body("total",equalTo(1561));
    }

    @Test
    public void getstorelist(){
        requestSpecification=given();
        validatableResponse=requestSpecification.get("/stores").then().log().all().body("total",equalTo(1561));

    }
}
