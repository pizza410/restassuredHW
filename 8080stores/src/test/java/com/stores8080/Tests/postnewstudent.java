package com.stores8080.Tests;

import com.stores8080.testbase.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class postnewstudent extends BaseTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableresponse;

    @Ignore
    @Test
    public void createnewsimple(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"firstName\": \"shubham\",\n" +
                        "    \"lastName\": \"Harper\",\n" +
                        "    \"email\": \"panchalshubh98@gmail.com\",\n" +
                        "    \"programme\": \"Financial Analysis\",\n" +
                        "    \"courses\": [\n" +
                        "        \"Accounting\",\n" +
                        "        \"Statistics\"\n" +
                        "    ]\n" +
                        "}")
                .post("/student")
                .then().log().all();

    }
    @Test
    public void addnewstudent(){
        String data="{\n" +
                "    \"firstName\": \"shubham\",\n" +
                "    \"lastName\": \"Harper\",\n" +
                "    \"email\": \"xyz123@gmail.com\",\n" +
                "    \"programme\": \"Financial Analysis\",\n" +
                "    \"courses\": [\n" +
                "        \"Accounting\",\n" +
                "        \"Statistics\"\n" +
                "    ]\n" +
                "}";
        requestSpecification=given();
        response=requestSpecification.contentType(ContentType.JSON).body(data)
                .post("/student");
        response.prettyPrint();

    }
}
