package com.fakerest.tests;

import com.fakerest.testbase.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class updatebyid extends BaseTest {
    RequestSpecification requestspecification;
    Response response;
    ValidatableResponse validatableresponse ;
    @Test
    public void updatebyid(){
        String data="{\"id\":0,\"userName\":\"string\",\"password\":\"string\"}";
        requestspecification=given();
        response=requestspecification.contentType(ContentType.JSON).body(data).put("/1");
        validatableresponse=response.then().log().all().body("id",equalTo(0));

    }
}
