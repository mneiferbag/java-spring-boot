package eu.mneifercons.examples.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VerbController {

    // TODO how to fine-tune error responses for generated OpenAPI spec?
    // See https://springdoc.org/#error-handling-for-rest-using-controlleradvice
    // and https://www.baeldung.com/exception-handling-for-rest-with-spring
    // and https://www.baeldung.com/spring-response-status
    private static final Logger log = LoggerFactory.getLogger(VerbController.class);

    private final VerbService verbService;

    @Autowired
    public VerbController(VerbService verbService) {
        this.verbService = verbService;
    }

    @PostMapping("/verb")
    public void addVerb(@RequestBody Verb verb) {
        log.info("Adding verb: {}", verb);
        this.verbService.addVerb(verb);
    }

    @DeleteMapping("/verb/{name}")
    public void deleteVerb(@PathVariable(value = "name") String name) {
        log.info("Deleting verb with name {}", name);
        this.verbService.deleteVerb(name);
    }

    @GetMapping("/verb/{name}")
    @ResponseBody
    public Verb getVerb(@PathVariable(value = "name") String name) {
        log.info("Returning verb with name {}", name);
        return this.verbService.getVerb(name);
    }

    @GetMapping("/verb")
    @ResponseBody
    public List<Verb> getVerbs() {
        List<Verb> verbs = this.verbService.getVerbs();
        log.info("Returning {} verbs", verbs.size());
        return verbs;
    }

    @PutMapping("/verb/{name}")
    public void updateVerb(@PathVariable(value = "name") String name, @RequestBody Verb verb) {
        log.info("Updating verb with name {}", name);
        this.verbService.updateVerb(name, verb);
    }
}
