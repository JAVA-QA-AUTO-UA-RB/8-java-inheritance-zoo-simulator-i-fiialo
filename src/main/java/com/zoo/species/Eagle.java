package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;

public class Eagle extends Bird implements ISleepable, IPlayable {

    public Eagle(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " слон трубить");
    }

    @Override
    public void eat() {
        energyLevel += 10;
        System.out.println( name + " їсть (+10 енергії)");
    }

    @Override
    public void sleep() {
        energyLevel += 15;
        System.out.println(name + " спить (+15 енергії)");
    }

    @Override
    public void  uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
        System.out.println ( name + " будує гніздо (-20 енергії)");
        int energy = getEnergyLevel();
        if (energy>=20) {
            setEnergyLevel(energy -20);
        }
    }



    @Override
    public void play() {
        energyLevel -= 20;
        System.out.println( name + " грається (-20 енергії)");
    }
}