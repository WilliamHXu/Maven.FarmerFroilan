package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.FarmStuff.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.FarmStuff.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class Wednesday extends DayOfWeek{

    public void run(Farm farm) {
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
        showSilo(farm);
    }

    public void afternoon(Farm farm) {
        ArrayList<ChickenCoop> chickenCoops = farm.getChickenCoops();
        Silo silo = farm.getSilo();
        for (ChickenCoop coop : chickenCoops){
            ArrayList<Chicken> chickens = coop.get();
            for(Chicken chicken : chickens){
                for (int i = 0; i < 3; i++) {
                    Edible egg = chicken.yield();
                    if(egg != null){
                        silo.addEdible(egg);
                    }
                }
            }
        }
    }
}
