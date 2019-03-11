package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft.CropDuster;

public class Monday extends DayOfWeek {
    public static void run(Farm farm) {
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
        showSilo(farm);
    }

    public static void afternoon(Farm farm) {
        CropDuster cropDuster = farm.getCropDuster();
        froilanda.mount(cropDuster);
        cropDuster.operate(farm);
        froilanda.dismount(cropDuster);
    }
}
