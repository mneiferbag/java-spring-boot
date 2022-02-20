package eu.mneifercons.examples.spring;

import org.junit.jupiter.api.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

class VerbControllerStandaloneTest {

    @Test
    void getVerbByName() {
        VerbService service = new VerbServiceImpl();
        VerbController controller = new VerbController(service);

        given()
                .standaloneSetup(controller)
                .when()
                .get("/verb/trabajar")
                .then()
                .statusCode(200)
                .body("name", equalTo("trabajar"));
    }
}
