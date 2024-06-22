package com.stores3030.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void inIT(){
        RestAssured.baseURI="http://localhost:3030/";
        RestAssured.port=3030;
    }
}
