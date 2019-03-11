package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.FarmStuff.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;



public class Tuesday extends DayOfWeek {

    public static void run(Farm farm) {
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
        showSilo(farm);
    }

    public static void afternoon(Farm farm) {
        Tractor tractor = farm.getTractor();
        froilan.mount(tractor);
        Edible[] edibles = tractor.operate(farm);
        froilan.dismount(tractor);
        Silo silo = farm.getSilo();
        for (Edible edible : edibles){
            silo.addEdible(edible);
        }
    }
}

