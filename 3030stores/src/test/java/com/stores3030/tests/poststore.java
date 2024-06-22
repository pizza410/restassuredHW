package com.stores3030.tests;

import com.stores3030.testbase.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class poststore extends BaseTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Ignore
    @Test
    public void createstoresimple(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"name\": \"shubh\",\n" +
                        "  \"type\": \"string\",\n" +
                        "  \"address\": \"string\",\n" +
                        "  \"address2\": \"string\",\n" +
                        "  \"city\": \"string\",\n" +
                        "  \"state\": \"string\",\n" +
                        "  \"zip\": \"string\",\n" +
                        "  \"lat\": 0,\n" +
                        "  \"lng\": 0,\n" +
                        "  \"hours\": \"string\",\n" +
                        "  \"services\": {}\n" +
                        "}")
                .post("/stores")
                .then().log().all()
                .statusCode(201);
    }
    @Test
    public void createstore(){
        String data="{\n" +
                "  \"name\": \"shubhm\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"address\": \"string\",\n" +
                "  \"address2\": \"string\",\n" +
                "  \"city\": \"string\",\n" +
                "  \"state\": \"string\",\n" +
                "  \"zip\": \"string\",\n" +
                "  \"lat\": 0,\n" +
                "  \"lng\": 0,\n" +
                "  \"hours\": \"string\",\n" +
                "  \"services\": {}\n" +
                "}";
        requestSpecification= RestAssured.given();
        validatableResponse=requestSpecification
                .contentType(ContentType.JSON)
                .body(data)
                .post("/stores")
                .then().log().all();
        validatableResponse.statusCode(201);

    }
}
