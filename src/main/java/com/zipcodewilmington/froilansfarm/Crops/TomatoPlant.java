package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
        hasBeenHarvested = false;
        hasBeenFertilized = false;
    }

    // Yields a Tomato
    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new Tomato();
        }
        return null;
    }
}
