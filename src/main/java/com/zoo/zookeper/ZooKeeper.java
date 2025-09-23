package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.IPlayable;

public class ZooKeeper {
    //Private field
    private String name;

    //Constructor
    public ZooKeeper(String name) {
        this.name = name;
    }

    //Feed animal
    public void feedAnimal(IEatable animal) {
        System.out.println(name + " годує " + ((Animal)animal).getName() + ".");
        animal.eat();
    }

    //Play with animal
    public void playWithAnimal(IPlayable animal) {
        System.out.println(name + " грається з " + ((Animal)animal).getName() + ".");
        animal.play();
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