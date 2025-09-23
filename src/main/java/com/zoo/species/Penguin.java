package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Penguin extends Bird implements IPlayable {

    public Penguin(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " пінгвін кричить: кря-кря!");
    }

    @Override
    public void eat() {
        increaseEnergy(10);
        System.out.println(name + " їсть. Енергія зараз " + getEnergyLevel() + ".");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " спить. Енергія зара " + getEnergyLevel() + ".");
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

    public void fly() {
        System.out.println(name + " не літає, а плаває");
        swim();
    }

    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }

    private void surfOnIce() {
        if (getEnergyLevel() >= 20) {
            decreaseEnergy(20);
            System.out.println(name + " серфінг на льоду. Енергія зараз" + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " дуже втомився.");
        }
    }

    public void swim() {
        if (getEnergyLevel() >= 10) {
            decreaseEnergy(10);
            System.out.println(name + " плаває. Енергія зараз" + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " дуже втомився.");
        }
    }
}