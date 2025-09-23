package com.zoo.animals;

import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.ISleepable;

public abstract class Animal implements IEatable, ISleepable {

    protected String name;
    protected int energyLevel = 100;

    public Animal(String name, int energyLevel) {
        this.name = name;
        setEnergyLevel(energyLevel);
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }

    public void increaseEnergy(int amount) {
        setEnergyLevel(this.energyLevel + amount);
    }

    public void decreaseEnergy(int amount) {
        setEnergyLevel(this.energyLevel - amount);
    }

    public abstract void makeSound();

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();
}