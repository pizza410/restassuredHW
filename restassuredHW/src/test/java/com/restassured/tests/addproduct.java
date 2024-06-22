package com.restassured.tests;

import com.restassured.testBase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class addproduct extends TestBase {
    Response response;
    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;

    @Test
    public void addproductssimply(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"name\": \"shubham\",\n" +
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
                .post("/products")
                .then().log().all()
                .statusCode(201);
    }

    @Test
    public void  addproducts(){
        String data="{\n" +
                "  \"name\": \"shubham Panchal\",\n" +
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
        requestSpecification=given();
        response=requestSpecification.contentType(ContentType.JSON).body(data).post("/products");
        validatableResponse=response.then().log().all();
        validatableResponse.statusCode(201);


    }


}
