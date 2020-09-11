package com.xenoteo.stacksAndQueues.animalShelter.animals;

/**
 * Representing an animal by its name and time of arrival to a shelter.
 */
public abstract class Animal {
    private int time;
    private String name;

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
