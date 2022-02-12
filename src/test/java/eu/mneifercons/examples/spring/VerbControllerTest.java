package eu.mneifercons.examples.spring;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class VerbControllerTest {

    @Test
    void bodyOkay() {
        Verb verb = new Verb();
        verb.setName("caminar");
        verb.setFirst("camino");
        verb.setSecond("caminas");
        verb.setThird("camina");
        verb.setFirsts("caminamos");
        verb.setSeconds("camináis");
        verb.setThirds("caminan");

        VerbService service = new VerbServiceImpl();
        service.addVerb(verb);

        VerbController controller = new VerbController(service);

        given()
            .standaloneSetup(controller)
            .param("name", "caminar")
        .when()
            .get("/verb")
        .then()
            .statusCode(200)
            .body("name", equalTo("caminar"));
    }
}
