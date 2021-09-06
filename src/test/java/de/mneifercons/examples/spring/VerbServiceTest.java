package de.mneifercons.examples.spring;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class VerbServiceTest {

    @Test
    void addVerb() {
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

        assertThat(service.getNoOfVerbs(), equalTo(1));
    }

    @Test
    void deleteVerb() {

    }

    @Test
    void getVerbByName() {
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

        assertThat(service.getVerbByName("caminar").getFirst(), equalTo("camino"));
    }

    @Test
    void getVerbs() {
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

        assertThat(service.getNoOfVerbs(), equalTo(1));
        assertThat(service.getVerbByName("caminar").getFirst(), equalTo("camino"));
    }

    @Test
    void updateVerb() {
        Verb verb = new Verb();
        verb.setName("caminar");
        verb.setFirst("camin");
        verb.setSecond("camin");
        verb.setThird("camin");
        verb.setFirsts("camin");
        verb.setSeconds("camin");
        verb.setThirds("camin");

        VerbService service = new VerbServiceImpl();
        service.addVerb(verb);

        Verb changedVerb = new Verb();
        changedVerb.setName("caminar");
        changedVerb.setFirst("camino");
        changedVerb.setSecond("caminas");
        changedVerb.setThird("camina");
        changedVerb.setFirsts("caminamos");
        changedVerb.setSeconds("camináis");
        changedVerb.setThirds("caminan");

        service.updateVerb("caminar", changedVerb);

        assertThat(service.getNoOfVerbs(), equalTo(1));
        assertThat(service.getVerbByName("caminar").getFirst(), equalTo("camino"));
        assertThat(service.getVerbByName("caminar").getSecond(), equalTo("caminas"));
        assertThat(service.getVerbByName("caminar").getThird(), equalTo("camina"));
        assertThat(service.getVerbByName("caminar").getFirsts(), equalTo("caminamos"));
        assertThat(service.getVerbByName("caminar").getSeconds(), equalTo("camináis"));
        assertThat(service.getVerbByName("caminar").getThirds(), equalTo("caminan"));
    }
}
