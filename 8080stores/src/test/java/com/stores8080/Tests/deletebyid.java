package com.stores8080.Tests;

import com.stores8080.testbase.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deletebyid extends BaseTest {
    @Test
    public void deletebyIdSimple(){
        given()
                .when()
                .delete("/student/106")
                .then().log().all()
                .statusCode(204);
    }
}
