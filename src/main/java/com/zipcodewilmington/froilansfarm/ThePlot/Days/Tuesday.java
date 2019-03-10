package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.SoybeanPlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Soybean;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;

import java.util.Set;

public class Tuesday extends DayOfWeek {

    public static void run(Farm farm) {
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
    }

    public static void afternoon(Farm farm) {
        harvestCrops(farm, new CornStalk());
        harvestCrops(farm, new TomatoPlant());
        harvestCrops(farm, new SoybeanPlant());

    }
    public static void harvestCrops(Farm farm, Crop crop) {
        CropRow cropRow = null;
        Tractor tractor = new Tractor();

        froilan.mount(tractor);

        if (crop instanceof CornStalk) {
            cropRow = farm.getField().get().get(0);
            for (int i = 200; i > 0; i--) {
                cropRow.remove(new CornStalk());
                farm.getSilo().addEdible(new EarCorn());
            }
        }
        else if (crop instanceof TomatoPlant) {
            cropRow = farm.getField().get().get(1);
            for (int i = 80; i > 0; i--) {
                cropRow.remove(new TomatoPlant());
                farm.getSilo().addEdible(new Tomato());
            }
        }
        else {
            cropRow = farm.getField().get().get(2);
            for (int i = 500; i > 0; i--) {
                cropRow.remove(new SoybeanPlant());
                farm.getSilo().addEdible(new Soybean());
            }
        }
        froilan.dismount(tractor);
    }
}

