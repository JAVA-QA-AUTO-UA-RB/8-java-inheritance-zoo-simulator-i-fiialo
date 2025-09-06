package com.zoo.zookeper;

import com.zoo.animals.Animal;

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
        animal.decreaseEnergyLevelBy(20);
        System.out.print(animal.getName() + ": грається — ");
        animal.makeSound();
    }

    public String checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String level;

        if (energy <= 30) level = "низький";
        else if (energy <= 70) level = "середній";
        else level = "високий";

        return animal.getName() + ": рівень енергії у " + " — " + level;
    }
    }