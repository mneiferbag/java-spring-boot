package de.mneifercons.examples.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VerbServiceImpl implements VerbService {

    private List<Verb> verbs = new ArrayList<>();

    public VerbServiceImpl() {
        var verb = new Verb();
        verb.setName("trabajar");
        verb.setFirst("trabajo");
        verb.setSecond("trabajas");
        verb.setThird("trabaja");
        verb.setFirsts("trabajamos");
        verb.setSeconds("trabajáis");
        verb.setThirds("trabajan");

        verbs.add(verb);
    }

    @Override
    public List<Verb> getVerbs() {
        return verbs;
    }
}
