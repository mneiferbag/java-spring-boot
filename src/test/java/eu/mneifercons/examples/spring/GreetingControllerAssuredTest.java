package eu.mneifercons.examples.spring;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

class GreetingControllerAssuredTest {

    @Test
    void bodyOkay() {
        given()
            .standaloneSetup(new GreetingController())
        .when()
            .get("/greeting")
        .then()
            .statusCode(200)
            .body(is(equalTo("{\"id\":1,\"content\":\"Hello, World!\"}")));
    }
}
