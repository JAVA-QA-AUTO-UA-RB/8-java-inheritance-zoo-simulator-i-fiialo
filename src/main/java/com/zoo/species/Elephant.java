package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Elephant extends Mammal  implements IPlayable {

    public Elephant(String name, int energyLevel) {
        super(name, energyLevel);
    }

    public void move() {
        System.out.println(name + " слон сильно топає");
    }

    @Override
    public void eat() {
        decreaseEnergy(10);
        System.out.println(name + " слон їсть траву. Енергрія зараз " + getEnergyLevel() + ".");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубаба!");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " слон спить. Енергія зараз " + getEnergyLevel() + ".");
    }

    @Override
    public void play() {
        if (getEnergyLevel() >= 20) {
            decreaseEnergy(20);
            System.out.println(name + " грається з шиною. Енергія зараз " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " втомився, щоб продовжувати гратись.");
        }
    }

    public void spraySelf() {
        if (getEnergyLevel() >= 10) {
            decreaseEnergy(10);
            System.out.println(name + " обливається водою. Енергія зараз " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " занадто втомився.");
        }
    }
}