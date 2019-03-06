package com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;

public interface Botanist {
    public void plant(Crop crop, CropRow row);
}
