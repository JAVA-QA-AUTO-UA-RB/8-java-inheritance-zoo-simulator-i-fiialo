package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {


    public Lion(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    public void makeSound() {
        System.out.println("Ppppp!");
    }

    public void hunt() {
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy - 25);
        System.out.println(getName() + " полює.");
    }
}