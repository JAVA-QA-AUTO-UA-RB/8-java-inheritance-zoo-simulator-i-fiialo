package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.IPlayable;
import com.zoo.species.Penguin;
import com.zoo.species.Lion;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    private static ZooKeeper keeper;

    public static void main(String[] args) {

        // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.
        Lion Lion = new Lion("Max", 100);
        Eagle Eagle = new Eagle("Kendrik", 100);
        Penguin Penguin = new Penguin("Ozz", 100);
        Elephant Elephant = new Elephant("Mary", 100);

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.
        ZooKeeper keeper = new ZooKeeper("Ihor");

        System.out.println("Ласкаво прошу в наш Зоопарк\n");

        // Масив тварин,які можуть грати
        IPlayable[] playables = {Lion, Eagle, Elephant, Penguin};
        for (IPlayable animal : playables) {
            keeper.playWithAnimal(animal);
        }
        System.out.println();

        Lion.hunt();
        Eagle.uniqueBirdAction();
        Penguin.uniqueBirdAction();
        Elephant.spraySelf();

        System.out.println();

        keeper.feedAnimal(Lion);
        keeper.feedAnimal(Eagle);
        keeper.feedAnimal(Penguin);
        keeper.feedAnimal(Elephant);

        System.out.println();

        Lion.sleep();
        Eagle.sleep();
        Penguin.sleep();
        Elephant.sleep();

        System.out.println("\n Перевірка рівня енергії після активності");

        // Виведіть фінальні результати та стани тварин наприкінці дня.
        Animal[] animals = {Lion, Eagle, Penguin, Elephant};
        for (Animal a : animals) {
            int energy = a.getEnergyLevel();
            String energyLevel;

            if (energy <= 30) {
                energyLevel = "низький";
            } else if (energy <= 70) {
                energyLevel = "середній";
            } else {
                energyLevel = "високий";
            }
            System.out.println(" - " + a.getName() + " має " + energyLevel + " енергвї (" + energy + ")");
        }
    }
}