package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    // Yields an EarCorn
    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            return new EarCorn();
        }
        return null;
    }
}
