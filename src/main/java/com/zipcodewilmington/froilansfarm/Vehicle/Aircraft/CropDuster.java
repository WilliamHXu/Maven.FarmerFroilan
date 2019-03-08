package com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    private Person pilot;
    private boolean isFlying;


    public CropDuster() {

        isFlying = false;
        pilot = null;
    }

    public boolean assignPilot(Person pilot) {

        boolean bool = false;
        if (pilot instanceof Pilot) {
            this.pilot = pilot;
            bool = true;

        }
        return bool;
    }

    public void disEmbark() {

        pilot= null;

    }


    public void makeNoise() {

        String noise = "Hum and Roar!";
        System.out.println(noise);
    }

    public void fly() {

        if(assignPilot(pilot)) {
            isFlying = true;
        }

        else {

        }
    }

    public Edible[] operate(Farm farm) {

        if (isFlying = false) {
            System.out.println("Will start flying the crop duster to operate");
            fly();
            Field field = farm.getField();
            ArrayList <CropRow> cropRows = field.get();
            for(CropRow c : cropRows) {
                fertilize(c);
            }
            System.out.println("Now the field in the farm has been dusted");
        } else
            System.out.println("The field in the farm has been dusted");
        return null;
    }

    public void fertilize(CropRow cropRow) {

        ArrayList<Crop> crops = cropRow.get();

        for (Crop c : crops) {
            c.fertilize();
        }
        System.out.println("The crop row has been fertilized");
    }

    public boolean getisFlying() {
        return isFlying;
    }
}
