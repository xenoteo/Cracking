package com.xenoteo.stacksAndQueues.animalShelter;

import com.xenoteo.stacksAndQueues.animalShelter.animals.*;

public class Main {
    public static void main(String[] args) {
        printAnimals();
    }

    /**
     * Creating cats and dogs, adding them to the shelter and printing results of dequeuing them.
     */
    private static void printAnimals(){
        Animal lucy = new Dog("Lucy");
        Animal charlie = new Dog("Charlie");
        Animal archie = new Dog("Archie");
        Animal oliver = new Cat("Oliver");
        Animal max = new Cat("Max");
        Animal simba = new Cat("Simba");
        Animal simon = new Cat("Simon");
        System.out.println("Animal lucy = new Dog(\"Lucy\");\n" +
                "Animal charlie = new Dog(\"Charlie\");\n" +
                "Animal archie = new Dog(\"Archie\");\n" +
                "Animal oliver = new Cat(\"Oliver\");\n" +
                "Animal max = new Cat(\"Max\");\n" +
                "Animal simba = new Cat(\"Simba\");\n" +
                "Animal simon = new Cat(\"Simon\");\n");

        AnimalShelter shelter = new AnimalShelter();
        System.out.println("AnimalShelter shelter = new AnimalShelter();\n");

        shelter.enqueue(lucy);
        shelter.enqueue(charlie);
        shelter.enqueue(max);
        shelter.enqueue(archie);
        shelter.enqueue(simba);
        shelter.enqueue(oliver);
        shelter.enqueue(simon);
        System.out.println("shelter.enqueue(lucy);\n" +
                "shelter.enqueue(charlie);\n" +
                "shelter.enqueue(max);\n" +
                "shelter.enqueue(archie);\n" +
                "shelter.enqueue(simba);\n" +
                "shelter.enqueue(oliver);\n" +
                "shelter.enqueue(simon);\n");

        System.out.printf("shelter.dequeueCat() = %s\n", shelter.dequeueCat());
        System.out.printf("shelter.dequeueDog() = %s\n", shelter.dequeueDog());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
        System.out.printf("shelter.dequeueDog() = %s\n", shelter.dequeueDog());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
        System.out.printf("shelter.dequeueCat() = %s\n", shelter.dequeueCat());
        System.out.printf("shelter.dequeueAny() = %s\n", shelter.dequeueAny());
    }
}
