package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {


    public Lion(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    public void makeSound() {
        System.out.println(getName() + " лев ричить: Ppppp!");
    }

    public void hunt() {
        decreaseEnergyLevelBy(20);
        System.out.println(getName() + " лев полює.");
    }
}