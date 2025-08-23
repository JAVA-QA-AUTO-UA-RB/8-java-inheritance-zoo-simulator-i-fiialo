package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;

public class Penguin extends Bird implements IPlayable {
    public Penguin(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void play() {
        energyLevel -= 15;
        System.out.println( name + " грається з водою (-15 енергії)");
    }

    @Override
    public void  uniqueBirdAction() {
        serfOnIce();
    }

    private void serfOnIce() {
        energyLevel -= 15;
        System.out.println ( name + " серфує на кризі (-35 енергії)");
    }

    @Override
    public void eat() {
        energyLevel += 15;
        System.out.println( name + " їсть рибу (+15 енергії)");
    }

    @Override
    public void sleep() {
        energyLevel += 10;
        System.out.println( name + " спить (+10 енергії)");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кря-кря");
    }

    public void swim(){
        int energy = getEnergyLevel();
        if (energy >=30) {
            System.out.println(name + " плаває (-30 енергії)");
            setEnergyLevel( energy -30);
        }
    }

    @Override
    public void fly() {
        energyLevel -= 10;
        System.out.println(name + " я не всію літати але вмію плавати! (-10 енергії)");
        swim();
    }
}