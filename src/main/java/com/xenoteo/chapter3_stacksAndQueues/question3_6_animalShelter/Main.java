package com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter;

import com.xenoteo.chapter3_stacksAndQueues.question3_6_animalShelter.animals.*;

public class Main {
    public static void main(String[] args) {
        printAnimals();
    }

    /**
     * Creates cats and dogs, adds them to the shelter and prints results of dequeuing them.
     */
    private static void printAnimals(){
        Animal lucy = new Dog("Lucy");
        Animal charlie = new Dog("Charlie");
        Animal archie = new Dog("Archie");
        Animal oliver = new Cat("Oliver");
        Animal max = new Cat("Max");
        Animal simba = new Cat("Simba");
        Animal simon = new Cat("Simon");
        System.out.println("""
                Animal lucy = new Dog("Lucy");
                Animal charlie = new Dog("Charlie");
                Animal archie = new Dog("Archie");
                Animal oliver = new Cat("Oliver");
                Animal max = new Cat("Max");
                Animal simba = new Cat("Simba");
                Animal simon = new Cat("Simon");
                """);

        AnimalShelter shelter = new AnimalShelter();
        System.out.println("AnimalShelter shelter = new AnimalShelter();\n");

        shelter.enqueue(lucy);
        shelter.enqueue(charlie);
        shelter.enqueue(max);
        shelter.enqueue(archie);
        shelter.enqueue(simba);
        shelter.enqueue(oliver);
        shelter.enqueue(simon);
        System.out.println("""
                shelter.enqueue(lucy);
                shelter.enqueue(charlie);
                shelter.enqueue(max);
                shelter.enqueue(archie);
                shelter.enqueue(simba);
                shelter.enqueue(oliver);
                shelter.enqueue(simon);
                """);

        System.out.printf("shelter.dequeueCat() = %s\n", shelter.dequeueCat());
        System.out.printf("shelter.dequeueDog() = %s\n", shelter.dequeueDog());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
        System.out.printf("shelter.dequeueDog() = %s\n", shelter.dequeueDog());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
        System.out.printf("shelter.dequeueCat() = %s\n", shelter.dequeueCat());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
    }
}
