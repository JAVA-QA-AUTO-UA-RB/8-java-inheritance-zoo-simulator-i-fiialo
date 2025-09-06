package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {

        // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.
        Lion lion = new Lion(100, "Max", 15, 200, "жовтий");
        Eagle eagle = new Eagle(100, "Kendrick", 20, 70);
        Penguin penguin = new Penguin(100, "Ozz", 10, 36);
        Elephant elephant = new Elephant(100, "Mary", 13, 1600);

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.
        ZooKeeper zooKeeper = new ZooKeeper("Ihor");
        // Додайте логіку, яка представляє типові події дня в зоопарку:
        lion.makeSound();
        lion.hunt();

        eagle.makeSound();
        eagle.fly();

        penguin.makeSound();
        penguin.fly();

        elephant.makeSound();
        elephant.spraySelf();
        elephant.groom();
        // - Годування тварин: використання методу feedAnimal().

        zooKeeper.feedAnimal(lion);
        zooKeeper.feedAnimal(eagle);
        zooKeeper.feedAnimal(elephant);
        zooKeeper.feedAnimal(penguin);
        // - Гра з тваринами: використання методу playWithAnimal().

        zooKeeper.playWithAnimal(lion);
        zooKeeper.playWithAnimal(eagle);
        zooKeeper.playWithAnimal(elephant);
        zooKeeper.playWithAnimal(penguin);
        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        System.out.println(zooKeeper.checkAnimalEnergyLevel(lion));
        System.out.println(zooKeeper.checkAnimalEnergyLevel(eagle));
        System.out.println(zooKeeper.checkAnimalEnergyLevel(elephant));
        System.out.println(zooKeeper.checkAnimalEnergyLevel(penguin));
        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).

        lion.hunt();
        lion.eat();
        lion.sleep();

        eagle.fly();
        eagle.eat();
        eagle.sleep();

        elephant.spraySelf();
        elephant.eat();
        elephant.sleep();

        penguin.fly();
        penguin.eat();
        penguin.sleep();
        // Виведіть фінальні результати та стани тварин наприкінці дня.
        System.out.println(" -- День в зоопарку закінчився --");
        lion.displayInfo();
        eagle.displayInfo();
        elephant.displayInfo();
        penguin.displayInfo();
    }
}