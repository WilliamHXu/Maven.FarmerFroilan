package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    public CornStalk() {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    // Yields an EarCorn
    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new EarCorn();
        }
        return null;
    }

}
