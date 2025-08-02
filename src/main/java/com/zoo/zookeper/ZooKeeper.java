package com.zoo.zookeper;

import com.zoo.animals.Animal;
import jdk.internal.access.JavaLangInvokeAccess;

public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feedAnimal(Animal animal) {
        animal.eat();
        System.out.println(animal.getName() + " поїв.");
    }

    public void playWithAnimal(Animal animal) {
        System.out.print(animal.getName() + ": грається — ");
        animal.makeSound();
    }

    public String checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String level;

        if (energy >= 0 && energy <= 30) {
            level = "низький";
        } else if (energy <= 70) {
            level = "середній";
        } else if (energy <= 100) {
            level = "високий";
        } else {
            level = "невідомий рівень енергії";
        }

        return animal.getName() + ": рівень енергії у " + " — " + level;
    }
    }