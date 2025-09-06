package com.zoo.animals;

public class Animal {

    private int energyLevel;
    protected String name;
    protected int age;
    protected int weight;

    public Animal(int energyLevel, String name, int age, int weight) {
        this.energyLevel = energyLevel;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        setEnergyLevel(this.energyLevel + 5);
    }

    public void sleep() {
        setEnergyLevel(this.energyLevel + 10);
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void displayInfo() {
        System.out.println("Інформація: Енергія = " + energyLevel + ", Ім'я = " + name + ", Вік = " + age + ", Вага = " + weight);
    }

    public void decreaseEnergyLevelBy(int energyPoints) {
        setEnergyLevel(this.energyLevel - energyPoints);
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }
}