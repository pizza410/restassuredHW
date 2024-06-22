package hmpetstore.tests;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class petinventory {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void getinventory(){
        requestSpecification=given();
        response=requestSpecification.get("/store/inventory");
        validatableResponse=response.then().log().all().statusCode(200);
    }
}
