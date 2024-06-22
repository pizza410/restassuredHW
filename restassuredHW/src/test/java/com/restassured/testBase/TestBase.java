package com.restassured.testBase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIT(){
        RestAssured.baseURI="http://localhost:3030/";
        RestAssured.port=3030;
    }

}
