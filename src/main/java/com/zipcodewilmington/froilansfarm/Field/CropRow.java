package com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.CRUDs;

import java.util.ArrayList;


public class CropRow extends CRUDs<Crop> {

    public CropRow() {
        objects = new ArrayList<Crop>();
    }

}
