package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {
    // Yields a Tomato
    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            return new Tomato();
        }
        return null;
    }
}
