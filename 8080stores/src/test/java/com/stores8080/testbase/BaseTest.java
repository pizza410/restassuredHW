package com.stores8080.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void inIt(){
        RestAssured.baseURI="http://localhost:8080/";
        RestAssured.port=8080;
    }
}
