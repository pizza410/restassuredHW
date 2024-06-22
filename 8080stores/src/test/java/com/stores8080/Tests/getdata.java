package com.stores8080.Tests;

import com.stores8080.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getdata extends BaseTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Ignore
    @Test
    public void getdatasimple(){
        given()
                .when()
                .get("student/list")
                .then().log().all().statusCode(200);
    }

    @Test
    public void getdata(){
        validatableResponse=given().when().get("student/list").then().log().all().statusCode(200);

    }
}
