package com.fakerest.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void inIT(){
        RestAssured.baseURI="https://fakerestapi.azurewebsites.net/api/v1/Users";
    }
}
