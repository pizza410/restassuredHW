package com.restassured.tests;

import com.restassured.testBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class getProducts extends TestBase {
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void verifyList(){
        response=RestAssured.get("/products");
       String s= response.prettyPrint();
       validatableResponse=response.then();
       validatableResponse.body("data[0].id",equalTo(43900));


    }
}
