package com.jackietreehornpublishing;

/**
 * Created by russellmiles on 05/07/2016.
 */
public class StubPersonFinder implements PersonFinder {

    @Override
    public Person randomPerson() {
        return new Person("Prince", 57);
    }
}
