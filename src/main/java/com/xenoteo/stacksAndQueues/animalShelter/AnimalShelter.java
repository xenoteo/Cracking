package com.xenoteo.stacksAndQueues.animalShelter;

import com.xenoteo.stacksAndQueues.animalShelter.animals.*;

import java.util.LinkedList;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * The data structure maintains this system.
 */
public class AnimalShelter implements IAnimalShelter{
    private final LinkedList<Cat> cats;
    private final LinkedList<Dog> dogs;
    /**
     * "Current" time in a shelter.
     */
    private int time;

    public AnimalShelter(){
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
        time = 0;
    }

    @Override
    public void enqueue(Animal animal) {
        time++;
        animal.setTime(time);
        if (animal instanceof Cat)
            cats.add((Cat)animal);
        else if (animal instanceof Dog)
            dogs.add((Dog)animal);
    }

    @Override
    public Animal dequeueAny() {
        if (cats.size() == 0) return dequeueDog();
        if (dogs.size() == 0) return dequeueCat();
        Cat cat = cats.getFirst();
        Dog dog = dogs.getFirst();
        if (cat.getTime() < dog.getTime())
            return dequeueCat();
        else
            return dequeueDog();
    }

    @Override
    public Cat dequeueCat() {
        if (cats.size() == 0)
            throw new NoSuchAnimalException();
        return cats.poll();
    }

    @Override
    public Dog dequeueDog() {
        if (dogs.size() == 0)
            throw new NoSuchAnimalException();
        return dogs.poll();
    }
}
