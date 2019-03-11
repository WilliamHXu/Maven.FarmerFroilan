package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.CRUDs;

import java.util.ArrayList;

public class Field extends CRUDs<CropRow> {

    public Field() {
        objects = new ArrayList<CropRow>();
    }

    public void clear(){
        for(CropRow cropRow : objects){
            cropRow.clear();
        }
    }
}
