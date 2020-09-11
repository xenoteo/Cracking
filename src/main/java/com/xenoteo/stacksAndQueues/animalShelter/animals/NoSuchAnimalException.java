package com.xenoteo.stacksAndQueues.animalShelter.animals;

/**
 * Exception raised when there is no requested animals in the shelter.
 */
public class NoSuchAnimalException extends RuntimeException{
    public NoSuchAnimalException(){
        super();
    }

    public NoSuchAnimalException(String msg){
        super(msg);
    }
}
