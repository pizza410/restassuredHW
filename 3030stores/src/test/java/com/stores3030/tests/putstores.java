package com.stores3030.tests;

import com.stores3030.testbase.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class putstores extends BaseTest {
    RequestSpecification requesspecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Ignore
    @Test
    public void updatestoresimple(){
        given()
                .when().contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"name\": \"string\",\n" +
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
                .patch("/stores/8926")
                .then().log().all().statusCode(200);

    }

    @Test
    public void putstore(){
        String data="{\n" +
                "  \"name\": \"shubham\",\n" +
                "  \"type\": \"shubham\",\n" +
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
        requesspecification=given();
        response=requesspecification.contentType(ContentType.JSON).body(data).patch("/stores/8926");
        validatableResponse=response.then().log().all().body("name",equalTo("shubham"));
    }
}
