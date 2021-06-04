package de.mneifercons.examples.spring;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class VerbControllerTest {

    @Test
    void bodyOkay() {
        given()
            .standaloneSetup(new VerbController(new VerbServiceImpl()))
            .param("name", "trabajar")
        .when()
            .get("/verb")
        .then()
            .statusCode(200)
            .body("name", equalTo("trabajar"));
    }
}
