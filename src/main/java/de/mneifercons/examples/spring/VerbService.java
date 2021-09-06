package de.mneifercons.examples.spring;

import java.util.List;

public interface VerbService {

    void addVerb(Verb verb);

    void deleteVerb(String name);

    int getNoOfVerbs();

    Verb getVerbByName(String name);

    List<Verb> getVerbs();

    void updateVerb(String name, Verb verb);
}
