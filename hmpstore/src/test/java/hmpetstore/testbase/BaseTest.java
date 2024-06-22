package hmpetstore.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void inIT(){
        RestAssured.baseURI="https://petstore.swagger.io/v2";
    }
}
