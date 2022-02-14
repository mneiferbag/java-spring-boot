package eu.mneifercons.examples.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VerbController {

    private static final Logger log = LoggerFactory.getLogger(VerbController.class);

    private final VerbService verbService;

    @Autowired
    public VerbController(VerbService verbService) {
        this.verbService = verbService;
    }

    @GetMapping("/verb")
    public Verb getVerbs(@RequestParam(value = "name") String name) {
        var verb = this.verbService.getVerbByName(name);
        log.info("Returning verb: {}", verb);
        return verb;
    }

    @PostMapping("/verb")
    public void postVerb(@RequestBody Verb verb) {
        log.info("Adding verb: {}", verb);
        this.verbService.addVerb(verb);
    }
}
