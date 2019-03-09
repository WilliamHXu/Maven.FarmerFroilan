package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.Objects;

public abstract class Crop implements Produce {
    protected boolean hasBeenHarvested;
    protected boolean hasBeenFertilized;
    // Crops yield and Edible Object based on harvest and fertilized flags
    public abstract Edible yield();
    public void fertilize(){
        hasBeenFertilized = true;
    }
    public boolean isFertilized() {
        return hasBeenFertilized;
    }
    public boolean isHarvested() {
        return hasBeenHarvested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Crop)) return false;
        Crop crop = (Crop) o;
        return hasBeenHarvested == crop.hasBeenHarvested &&
                hasBeenFertilized == crop.hasBeenFertilized;
    }
}
