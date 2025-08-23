package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;


public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(IEatable animal) {
        System.out.println(name + " годує тварину");
        animal.eat();
    }


    public void playWithAnimal(IPlayable animal) {
        System.out.println(name + " грається з твариною ");

    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String level = "";// чесно кажу  - тут спитала гепете, бо ніяк не виходило ініціалізувати Левел
        if (energy <= 30) level = "Низький";
        else if (energy <= 70) level = "Середній";
        else if (energy > 71) level = "Високий";
        System.out.println(animal.getName() + " рівень енергії: " + level);
    }

    public String getName() {
        return name;
    }
}