package com.jackietreehornpublishing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonFinder personFinder = new StubPersonFinder();

    @RequestMapping(path = "/person")
    public Person randomPerson() {
        return personFinder.randomPerson();
    }
}

