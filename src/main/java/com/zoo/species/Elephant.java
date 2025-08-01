package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {

    public Elephant(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    public void makeSound() {
        System.out.println("Труба-ба-ба!");
    }

    public void spraySelf() {
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy - 30);
        System.out.println(getName() + " обливається водою.");
    }
}