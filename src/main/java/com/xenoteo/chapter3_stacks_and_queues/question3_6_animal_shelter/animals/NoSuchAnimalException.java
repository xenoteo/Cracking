package com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter.animals;

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
