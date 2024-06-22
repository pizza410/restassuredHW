package com.stores8080.Tests;

import com.stores8080.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class getbyid extends BaseTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Ignore
    @Test
    public void getstudentbyIDsimple(){
        given()
                .when()
                .get("student/1")
                .then().log().all()
                .body("firstName",equalTo("Vernon"));
    }

    @Test
    public void getbyID(){
        requestSpecification=given();
        response=requestSpecification.get("student/107");
        validatableResponse=response.then().log().all().body("firstName",equalTo("shubham"));
    }
}
