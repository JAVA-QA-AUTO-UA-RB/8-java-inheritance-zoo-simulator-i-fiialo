package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Eagle extends Bird implements IPlayable {

    public Eagle(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " орел кричить: кріі-кріі!");
    }

    @Override
    public void eat() {
        increaseEnergy(10);
        System.out.println(name + " їсть. Енергія зараз " + getEnergyLevel() + ".");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " спить. Енергія зараз " + getEnergyLevel() + ".");
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

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
        if (getEnergyLevel() >= 20) {
            decreaseEnergy(20);
            System.out.println(name + " будує гніздо. Енергія зараз " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " занадто втомився, щоб будувати гніздо.");
        }
    }
}