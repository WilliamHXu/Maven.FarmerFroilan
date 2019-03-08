package com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {



    public boolean isFlying = false;


    public void makeNoise() {

        String noise = "Hum and Roar!";
        System.out.println(noise);
    }

    public void fly() {

      isFlying = true;
    }

    public Edible [] operate(Farm farm) {

        if(isFlying = false)
            System.out.println("Please fly the crop duster to operate");

        else
            System.out.println("The field in the farm has been dusted");
        return null;
    }

    public void fertilize(CropRow cropRow){

        ArrayList<Crop> crops = cropRow.get();

//        for(Crop c : crops){
//            if(c.fertilize){
//                count++;
//            }
//
//        }


    }

    public boolean getisFlying() {
        return isFlying;
    }
}
