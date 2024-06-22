package com.restassured.tests;

import com.restassured.testBase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class patch extends TestBase {

    Response response;
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    @Test
    public void patchsimple(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"name\": \"vidhi\",\n" +
                        "  \"type\": \"string\",\n" +
                        "  \"price\": 0,\n" +
                        "  \"shipping\": 0,\n" +
                        "  \"upc\": \"string\",\n" +
                        "  \"description\": \"string\",\n" +
                        "  \"manufacturer\": \"string\",\n" +
                        "  \"model\": \"string\",\n" +
                        "  \"url\": \"string\",\n" +
                        "  \"image\": \"string\"\n" +
                        "}")
                .patch("/products/9999691")
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void patch(){
        requestSpecification=given();
        String data="{\n" +
                "  \"name\": \"vidhi shubham Panchal\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"price\": 0,\n" +
                "  \"shipping\": 0,\n" +
                "  \"upc\": \"string\",\n" +
                "  \"description\": \"string\",\n" +
                "  \"manufacturer\": \"string\",\n" +
                "  \"model\": \"string\",\n" +
                "  \"url\": \"string\",\n" +
                "  \"image\": \"string\"\n" +
                "}";
        validatableResponse=requestSpecification.contentType(ContentType.JSON).body(data).patch("/products/9999691").then().log().all().statusCode(200);

    }
}
