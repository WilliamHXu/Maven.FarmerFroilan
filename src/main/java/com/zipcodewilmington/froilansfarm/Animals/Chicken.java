package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public boolean eat(Edible food) {
        if (food instanceof EarCorn){
            return true;
        }
        else {
            return false;
        }
    }

    public void makeNoise() {
        String noise = "Cuck!";
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

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
