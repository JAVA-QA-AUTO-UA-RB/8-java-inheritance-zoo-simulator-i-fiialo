package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Lion extends Mammal implements IPlayable {

    public Lion(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лев ричить: Ppppp!");
    }

    @Override
    public void move() {
        decreaseEnergy(20); // втрата енергії при русі
        System.out.println(name + " лев рухається.");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " спить " + getEnergyLevel() + ".");
    }

    @Override
    public void eat() {
        increaseEnergy(10);
        System.out.println(name + " їсть " + getEnergyLevel() + ".");
    }

    @Override
    public void play() {
        if (getEnergyLevel() >= 20) {
            decreaseEnergy(20);
            System.out.println(getName() + " грається. Енергія зараз " + getEnergyLevel() + ".");
        } else {
            System.out.println(getName() + " занадто втомлений, щоб гратися.");
        }
    }

    public void hunt() {
        if (getEnergyLevel() >= 25) {
            decreaseEnergy(25);
            System.out.println(getName() + " полює. Енергія зараз " + getEnergyLevel() + ".");
        } else {
            System.out.println(getName() + " втомився, щоб далі полювати.");
        }
    }
}