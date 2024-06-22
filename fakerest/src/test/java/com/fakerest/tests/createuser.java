package com.fakerest.tests;

import com.fakerest.testbase.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class createuser extends BaseTest {
    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse ;
    @Test
    public void createnewuser(){
        String data="{\"id\":0,\"userName\":\"string\",\"password\":\"string\"}";
        requestspecification=given();
        response=requestspecification.contentType(ContentType.JSON).body(data).post();
        validatableresponse=response.then().log().all().statusCode(200);

    }
}
