package de.mneifercons.examples.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class VerbServiceImpl implements VerbService {

    private final List<Verb> verbs = new ArrayList<>();

    @Override
    public void addVerb(Verb verb) {
        this.verbs.add(verb);
    }

    @Override
    public List<Verb> getVerbs() {
        return this.verbs;
    }

    @Override
    public int getNoOfVerbs() {
        return this.verbs.size();
    }

    @Override
    public Verb getVerbByName(String name) {
        List<Verb> matchingVerbs = this.verbs.stream().filter(v -> v.getName().equals(name)).collect(Collectors.toList());

        if (matchingVerbs.isEmpty()) {
            throw new IllegalArgumentException(String.format("No verb with name '%s' found!", name));
        }
        return matchingVerbs.get(0);
    }

    @Override
    public void updateVerb(String name, Verb verb) {
        List<Verb> matchingVerbs = this.verbs.stream().filter(v -> v.getName().equals(name)).collect(Collectors.toList());

        if (matchingVerbs.isEmpty()) {
            throw new IllegalArgumentException(String.format("No verb with name '%s' found!", name));
        }
        this.verbs.remove(matchingVerbs.get(0));
        this.verbs.add(verb);
    }

    @Override
    public void deleteVerb(String name) {
        List<Verb> matchingVerbs = this.verbs.stream().filter(v -> v.getName().equals(name)).collect(Collectors.toList());

        if (matchingVerbs.isEmpty()) {
            throw new IllegalArgumentException(String.format("No verb with name '%s' found!", name));
        }
        this.verbs.remove(matchingVerbs.get(0));
    }
}
