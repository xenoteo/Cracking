package com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter;

import com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter.animals.Animal;
import com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter.animals.Cat;
import com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter.animals.Dog;

/**
 * The interface for an animal shelter.
 */
public interface IAnimalShelter {
    /**
     * Adds a new animal to the shelter.
     *
     * @param animal  the animal to add
     */
    void enqueue(Animal animal);

    /**
     * Gets "the oldest" animal from the shelter.
     *
     * @return the oldest animal
     */
    Animal dequeueAny();

    /**
     * Gets "the oldest" cat from the shelter.
     *
     * @return the oldest cat
     */
    Cat dequeueCat();

    /**
     * Gets"the oldest" dog from the shelter.
     *
     * @return the oldest dog
     */
    Dog dequeueDog();
}
