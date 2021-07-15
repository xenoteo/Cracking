package com.xenoteo.chapter3_stacks_and_queues.question3_6_animal_shelter.animals;

/**
 * The class representing an animal by its name and the time of arrival to a shelter.
 */
public abstract class Animal {
    /**
     * The time of arrival to the shelter.
     */
    private int time;
    /**
     * The animal's name.
     */
    private final String name;

    public Animal(String name){
        this.name = name;
    }

    public void setTime(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Animal)) return false;
        return ((Animal) obj).name.equals(name);
    }

    public String toString(){
        return this.name;
    }
}
