package com.zoo.animals;

public abstract class Bird extends Animal {


    public Bird (String name, int energyLevel) {
        super (name, energyLevel);
    }

    public abstract void uniqueBirdAction();
}