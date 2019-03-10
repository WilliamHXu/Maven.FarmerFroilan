package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.SoybeanPlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft.CropDuster;

public class Monday extends DayOfWeek {
    public static void run(Farm farm) {
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
    }

    public static void afternoon(Farm farm) {
        cropDust(farm, new CornStalk());
        cropDust(farm, new TomatoPlant());
        cropDust(farm, new SoybeanPlant());
    }

    public static void cropDust(Farm farm, Crop crop) {
        CropDuster cropDuster = null;
        CropRow cropRow;

        froilanda.mount(cropDuster);

        if (crop instanceof CornStalk) {
            cropRow = farm.getField().get().get(0);
            cropDuster.fertilize(cropRow);

        } else if (crop instanceof TomatoPlant) {
            cropRow = farm.getField().get().get(1);
            cropDuster.fertilize(cropRow);

        } else {
            cropRow = farm.getField().get().get(2);
            cropDuster.fertilize(cropRow);
        }

        froilanda.dismount(cropDuster);
    }
}
