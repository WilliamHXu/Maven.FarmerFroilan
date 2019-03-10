package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Soybean;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class SoybeanPlant extends Crop {
    public SoybeanPlant() {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    // Yields an EarCorn
    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new Soybean();
        }
        return null;
    }
}
