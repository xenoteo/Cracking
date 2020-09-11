package com.xenoteo.stacksAndQueues.animalShelter;

import com.xenoteo.stacksAndQueues.animalShelter.animals.Animal;
import com.xenoteo.stacksAndQueues.animalShelter.animals.Cat;
import com.xenoteo.stacksAndQueues.animalShelter.animals.Dog;

/**
 * Interface for animal shelter.
 */
public interface IAnimalShelter {
    /**
     * Adding a new animal to the shelter.
     * @param animal to add
     */
    void enqueue(Animal animal);

    /**
     * Getting "the oldest" animal from the shelter.
     * @return the oldest animal
     */
    Animal dequeueAny();

    /**
     * Getting "the oldest" cat from the shelter.
     * @return the oldest cat
     */
    Cat dequeueCat();

    /**
     * Getting "the oldest" dog from the shelter.
     * @return the oldest dog
     */
    Dog dequeueDog();
}
