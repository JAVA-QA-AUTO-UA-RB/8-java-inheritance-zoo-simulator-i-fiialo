package com.zoo.animals;

public class Mammal extends Animal{

    public Mammal(int energyLevel, String name, int age, int weight) {
        super(energyLevel, name, age, weight);
    }

    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }

    public void groom() {
        System.out.println("Догляд за шерстю");
    }
}