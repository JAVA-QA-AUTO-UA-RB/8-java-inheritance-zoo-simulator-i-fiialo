package com.zoo.animals;

public abstract class Bird extends Animal {

    public Bird(String name, int energyLevel) {
        super(name, energyLevel);

    }

    public abstract void  uniqueBirdAction();

    public void fly(){
        int energy = getEnergyLevel();
        if (energy >=15) {
            System.out.println(name + " летить");
            setEnergyLevel( energy -15);
        }
    }
}