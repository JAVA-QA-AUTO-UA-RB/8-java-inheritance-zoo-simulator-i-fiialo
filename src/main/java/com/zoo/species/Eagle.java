package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public Eagle(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    public void makeSound() {
        System.out.println("Кріі-кріі!");
    }

    public void fly() {
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy - 20);
        System.out.println(getName() + " літає.");
    }
}