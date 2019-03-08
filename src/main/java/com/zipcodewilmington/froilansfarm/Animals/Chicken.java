package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public Chicken() {
        hasBeenFertilized = false;
    }

    public boolean eat(Edible food) {
        if (food instanceof EarCorn){
            return true;
        }
        else {
            return false;
        }
    }

    public void makeNoise() {
        String noise = "Cluck!";
        System.out.println(noise);
    }

    public void makeNoise2() {
        String noise = "BABOAK!";
        System.out.println(noise);
    }

    public Edible yield() {
        if(!hasBeenFertilized){
            return new Egg();
        }
        else {
            makeNoise2();
            return null;
        }
    }

    public boolean isFertilized() {
        return hasBeenFertilized;
    }

    public void setFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
