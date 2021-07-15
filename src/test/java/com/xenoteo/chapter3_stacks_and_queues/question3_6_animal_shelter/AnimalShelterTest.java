package com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter;

import com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter.animals.Cat;
import com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter.animals.Dog;
import com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter.animals.NoSuchAnimalException;
import org.junit.Assert;
import org.junit.Test;

public class AnimalShelterTest {
    private AnimalShelter shelter;
    private Cat cat1;
    private Cat cat2;
    private Cat cat3;
    private Cat cat4;
    private Cat cat5;
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;
    private Dog dog4;
    private Dog dog5;
    private Dog dog6;

    public AnimalShelterTest(){
        shelter = new AnimalShelter();
        cat1 = new Cat("Jasper");
        cat2 = new Cat("Oscar");
        cat3 = new Cat("Shadow");
        cat4 = new Cat("Gracie");
        cat5 = new Cat("Roxy");
        dog1 = new Dog("Charlie");
        dog2 = new Dog("Ruby");
        dog3 = new Dog("Coco");
        dog4 = new Dog("Frankie");
        dog5 = new Dog("Rosie");
        dog6 = new Dog("Milo");
    }

    private void fillShelter(){
        shelter.enqueue(cat1);
        shelter.enqueue(dog1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);
        shelter.enqueue(cat4);
        shelter.enqueue(dog4);
        shelter.enqueue(dog5);
        shelter.enqueue(cat5);
        shelter.enqueue(dog6);
    }

    @Test(expected = NoSuchAnimalException.class)
    public void animalShelterTest(){
        fillShelter();
        Assert.assertEquals(cat1, shelter.dequeueAny());
        Assert.assertEquals(dog1, shelter.dequeueAny());
        Assert.assertEquals(cat2, shelter.dequeueCat());
        Assert.assertEquals(dog2, shelter.dequeueDog());
        Assert.assertEquals(dog3, shelter.dequeueAny());
        Assert.assertEquals(cat3, shelter.dequeueAny());
        Assert.assertEquals(cat4, shelter.dequeueCat());
        Assert.assertEquals(dog4, shelter.dequeueDog());
        Assert.assertEquals(dog5, shelter.dequeueDog());
        Assert.assertEquals(cat5, shelter.dequeueAny());
        Assert.assertEquals(dog6, shelter.dequeueAny());
        shelter.dequeueAny();
    }
}
