package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public Eagle(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " орел кричить: кріі-кріі!");
    }

    @Override
    public void fly() {
        decreaseEnergyLevelBy(20);
        System.out.println(getName() + " орел літає.");
    }
}