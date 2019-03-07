package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public boolean eat(Edible food) {
        if (food instanceof EarCorn){
            return true;
        }
        else {
            return false;
        }
    }

    public void makeNoise() {
        String noise = "Neigh!";
        System.out.println(noise);
    }
}
