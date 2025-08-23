package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {

    public Lion(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "  ричить");
    }

    @Override
    public void eat() {
        energyLevel += 10;
        System.out.println(name + " їсть м'ясо (+10 енергії)");
    }

    @Override
    public void sleep() {
        energyLevel += 15;
        System.out.println(name + " спить (+15 енергії)");
    }

    @Override
    public void move() {
        if (energyLevel >= 20) {
            energyLevel -= 20;
            System.out.println(name + " біжить (-20 енергії)");
        }
    }

    @Override
    public void play() {
        if (energyLevel >= 25) {
            energyLevel -= 25;
            System.out.println(name + " грається з м'ячем (-25 енергії)");
        }
    }
}