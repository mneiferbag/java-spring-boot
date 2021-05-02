package de.mneifercons.examples.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController {

    private static final Logger log = LoggerFactory.getLogger(VerbController.class);

    @GetMapping("/verb")
    public Verb getVerbs(@RequestParam(value = "name") String name) {
        Verb verb = new Verb();
        verb.setName("trabajar");
        verb.setFirst("trabajo");
        verb.setSecond("trabajas");
        verb.setThird("trabaja");
        verb.setFirsts("trabajamos");
        verb.setSeconds("trabajáis");
        verb.setThirds("trabajan");

        log.info("Returning verb: {}", verb);

        return verb;
    }
}
