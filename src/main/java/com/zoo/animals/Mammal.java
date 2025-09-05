package com.zoo.animals;

public class Mammal extends Animal{

    protected String furColor;

    public Mammal(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel);
        this.furColor = furColor;
    }

    public void makeSound() {
        System.out.println("Ссавець робить звук");
    }

    public void groom() {
        System.out.println("Догляд за шерстю");
    }
}
