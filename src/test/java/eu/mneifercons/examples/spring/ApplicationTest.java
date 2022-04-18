package eu.mneifercons.examples.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTest {

    @Autowired
    private VerbController controller;

    /**
     * Simple sanity check test that will fail if the application context cannot start.
     * See https://spring.io/guides/gs/testing-web/
     */
    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
