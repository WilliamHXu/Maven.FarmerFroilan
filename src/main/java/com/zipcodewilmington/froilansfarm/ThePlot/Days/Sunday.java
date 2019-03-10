package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.SoybeanPlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;

public class Sunday extends DayOfWeek{

    public static void afternoon(Farm farm){
        plantCropRow(farm, new CornStalk());
        plantCropRow(farm, new TomatoPlant());
        plantCropRow(farm, new SoybeanPlant());
    }

    public static void plantCropRow(Farm farm, Crop crop) {
        CropRow cropRow = null;
        if (crop instanceof CornStalk) {
            cropRow = farm.getField().get().get(0);
            for (int i = 0; i < 200; i++) {
                cropRow.add(new CornStalk());
            }
        }
        else if (crop instanceof TomatoPlant) {
            cropRow = farm.getField().get().get(1);
            for (int i = 0; i < 80; i++) {
                cropRow.add(new TomatoPlant());
            }
        }
        else {
            cropRow = farm.getField().get().get(2);
            for (int i = 0; i < 500; i++) {
                cropRow.add(new SoybeanPlant());
            }
        }
    }


}
