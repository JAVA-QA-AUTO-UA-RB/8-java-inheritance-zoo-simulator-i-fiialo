package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {

    public Penguin(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря!");
    }

    public void swim() {
        System.out.println("Буль-буль");
    }

    @Override
    public void fly() {
        System.out.println(name + " не літає,бо...  ");
        swim();
    }
}
