package de.mneifercons.examples.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController {

    private static final Logger log = LoggerFactory.getLogger(VerbController.class);

    private VerbService verbService;

    @Autowired
    public VerbController(VerbService verbService) {
        this.verbService = verbService;
    }

    @GetMapping("/verb")
    public Verb getVerbs(@RequestParam(value = "name") String name) {
        var verb = this.verbService.getVerbs().get(0);

        log.info("Returning verb: {}", verb);

        return verb;
    }
}
