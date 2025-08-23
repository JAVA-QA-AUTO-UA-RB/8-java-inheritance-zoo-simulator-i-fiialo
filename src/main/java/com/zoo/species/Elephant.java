package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal implements IPlayable {

    public Elephant(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void move() {
        energyLevel -= 10;
        System.out.println(name + " повільно рухається (-10 енергії)");
    }

    @Override
    public void play() {
        energyLevel -= 15;
        System.out.println(name + " грається (-15 енергії)");
    }

    @Override
    public void eat() {
        energyLevel += 10;
        System.out.println( name + " їсть (+10 енергії)");
    }

    @Override
    public void sleep() {
        energyLevel += 10;
        System.out.println(name + " спить (+10 енергії)");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубить");
    }

    public void spraySelf() {
        energyLevel -= 20;
        System.out.println(name + " обливається водою (-15 енергії)");
    }

    public void walking() {
        int energy = getEnergyLevel();
        if (energy >= 10) {
            System.out.println(name + "  ходить (-10 енергії)");
            setEnergyLevel(energy - 10);
        }
    }
}