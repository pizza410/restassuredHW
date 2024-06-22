package com.stores3030.tests;

import com.stores3030.testbase.BaseTest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deletestore extends BaseTest {
    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse;

    @Ignore
    @Test
    public void deletestorebyidsimple(){
        given()
                .when()
                .delete("/stores/8924")
                .then().statusCode(200);
    }
    @Test
    public void deletestorebyID(){
        requestspecification=given();
        response=requestspecification.delete("/stores/8925");
        validatableresponse=response.then().log().all().statusCode(200);
    }
}
