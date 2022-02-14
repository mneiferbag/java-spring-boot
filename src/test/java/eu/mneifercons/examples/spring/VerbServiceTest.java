package eu.mneifercons.examples.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VerbServiceTest {

    private final String first = "trabajo";
    private final String name = "trabajar";
    private Verb verb;
    private VerbService service;

    @BeforeEach
    void setUp() {
        this.verb = new Verb();
        verb.setName("caminar");
        verb.setFirst("camino");
        verb.setSecond("caminas");
        verb.setThird("camina");
        verb.setFirsts("caminamos");
        verb.setSeconds("camináis");
        verb.setThirds("caminan");
        this.service = new VerbServiceImpl();
    }

    @Test
    void addVerb() {
        this.service.addVerb(this.verb);

        assertThat(this.service.getNoOfVerbs(), equalTo(2));
    }

    @Test
    void deleteVerb() {
        this.service.deleteVerb(this.name);

        assertThat(this.service.getNoOfVerbs(), equalTo(0));
    }

    @Test
    void getVerbByName() {
        assertThat(this.service.getVerbByName(this.name).getFirst(), equalTo(this.first));
    }

    @Test
    void getVerbs() {
        assertThat(this.service.getVerbs().get(0).getFirst(), equalTo(this.first));
    }

    @Test
    void updateVerb() {
        this.service.addVerb(this.verb);

        Verb changedVerb = new Verb();
        changedVerb.setName("caminar");
        changedVerb.setFirst("camino");
        changedVerb.setSecond("caminas");
        changedVerb.setThird("camina");
        changedVerb.setFirsts("caminamos");
        changedVerb.setSeconds("camináis");
        changedVerb.setThirds("caminan");

        this.service.updateVerb("caminar", changedVerb);

        assertThat(this.service.getVerbByName("caminar").getFirst(), equalTo("camino"));
        assertThat(this.service.getVerbByName("caminar").getSecond(), equalTo("caminas"));
        assertThat(this.service.getVerbByName("caminar").getThird(), equalTo("camina"));
        assertThat(this.service.getVerbByName("caminar").getFirsts(), equalTo("caminamos"));
        assertThat(this.service.getVerbByName("caminar").getSeconds(), equalTo("camináis"));
        assertThat(this.service.getVerbByName("caminar").getThirds(), equalTo("caminan"));
    }
}
