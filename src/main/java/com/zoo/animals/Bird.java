package com.zoo.animals;

public class Bird extends Animal {


    public Bird(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Пташка щебече");
    }

    public void fly() {
        System.out.println(getName() + " летить.");
    }
}