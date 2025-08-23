package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion alex = new Lion("Alex", 100);
        Elephant mary = new Elephant("Mary", 100);
        Eagle kendrick = new Eagle("Kendrick", 100);
        Penguin ozz = new Penguin("Ozz", 100);

        ZooKeeper keeper = new ZooKeeper("Ihor");

        Animal[] animals = {alex, mary, kendrick, ozz};

        System.out.println("Дай Боже, звірята!");
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }

        System.out.println("\nЧас бавитись!");
        IPlayable[] playables = {alex, mary, kendrick, ozz};
        for (IPlayable play : playables) {
            keeper.playWithAnimal(play);
        }

        alex.move();
        alex.play();
        mary.move();
        mary.play();
        mary.spraySelf();
        ozz.swim();
        ozz.play();
        kendrick.uniqueBirdAction();
        kendrick.play();


        System.out.println("\nЧас підкріпитись!");
        for (Animal animal : animals) {
            keeper.feedAnimal(animal);
        }


        System.out.println("\nПеревірка рівня енергії тварин:");
        for (Animal animal : animals) {
            keeper.checkAnimalEnergyLevel(animal);
        }


        System.out.println("\nЗвірята пішли відпочивати:");
        for (Animal animal : animals) {
            animal.sleep(); // після ігор тварини відпочивають
            keeper.checkAnimalEnergyLevel(animal);
        }
    }
}