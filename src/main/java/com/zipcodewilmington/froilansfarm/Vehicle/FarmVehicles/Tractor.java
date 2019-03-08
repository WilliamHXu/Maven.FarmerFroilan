package com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class Tractor extends Vehicle implements FarmVehicle {

//    public Edible harvestCrop(Crop crop){
//
//        return crop.yield();
//    }

    public void makeNoise() {

        String noise = "Vroom!";
        System.out.println(noise);
    }

    public Edible[] harvest(CropRow cropRow) {

        ArrayList <Crop> crops = cropRow.get();
        ArrayList<Edible> edibles = new ArrayList<Edible>();

        for(Crop c:crops) {

                Edible edible = c.yield();
                if (edible != null) {

                    edibles.add(edible);
                }

            }

        return  edibles.toArray(new Edible[0]);
    }

        public Edible[] operate(Farm farm){

        Field field = farm.getField();
        ArrayList<Edible> edibles = new ArrayList<Edible>();

        ArrayList <CropRow> cropRows = field.get();
        for(CropRow c : cropRows){
            Edible [] edible = harvest(c);
            for (Edible e: edible) {
                edibles.add(e);
            }

        }
        return edibles.toArray(new Edible[0]);
        }


       // @Override AtEquals method

    }

