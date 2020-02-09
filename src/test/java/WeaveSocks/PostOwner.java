package WeaveSocks;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PostOwner {
    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "http://167.172.110.35";
        RestAssured.port = 80;
    }

    private Owner newOwner;

    @Test
    public void postOwnerTest() {
        newOwner = new Owner();
        newOwner.setUsername("Julia");
        newOwner.setPassword("123456");
        newOwner.setEmail("frfrf@gmail.com");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(newOwner)
                .post("/register")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Owner.class);

    }
}
