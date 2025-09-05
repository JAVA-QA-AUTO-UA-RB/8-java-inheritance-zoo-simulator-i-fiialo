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

    @Override
    public void fly() {
        System.out.println(getName() + " Пінгвін не літає, але плаває:");
        swim();
    }

    public void swim() {
        if (getEnergyLevel() >= 20) {
            decreaseEnergyLevelBy(20);
            System.out.println(getName() + " плаває (-20 енергії)");
        } else {
            System.out.println(getName() + " надто втомлений, щоб плавати");
        }
    }
}