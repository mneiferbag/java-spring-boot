package eu.mneifercons.examples.spring;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class VerbControllerMockMvcTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }

    @AfterEach
    public void tearDown() {
        RestAssuredMockMvc.reset();
    }

    @Test
    void getVerbByName() {
        given()
                .when()
                .get("/verb/trabajar")
                .then()
                .statusCode(200)
                .body("name", equalTo("trabajar"));
    }
}
