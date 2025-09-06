package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {

    public Elephant(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " слон кричить: труба-ба-ба!");
    }

    public void spraySelf() {
        decreaseEnergyLevelBy(20);
        System.out.println(getName() + " слон обливається водою (-20 енергії).");
    }
}