package com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter.animals;

/**
 * The exception raised when there is no requested animals in the shelter.
 */
public class NoSuchAnimalException extends RuntimeException{
    public NoSuchAnimalException(){
        super();
    }

    public NoSuchAnimalException(String msg){
        super(msg);
    }
}
