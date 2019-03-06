package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public boolean eat(Edible food) {
        return false;
    }

    public void makeNoise() {

    }

    public Edible yield() {
        if(!hasBeenFertilized){
            return new Egg();
        }
        return null;
    }
}
