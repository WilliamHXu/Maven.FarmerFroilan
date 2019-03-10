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


    public void makeNoise() {

        String noise = "Hum and Roar!";
        System.out.println(noise);
    }

    public void fly() {
        if(pilot instanceof Pilot) {
            isFlying = true;
            System.out.println("We flying!");
        }

        else {
            System.out.println("I can't fly this!");
        }
    }

    public void land(){
        isFlying = false;
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

    public boolean getIsFlying() {
        return isFlying;
    }

    @Override
    public void seatRider(Person person) {
        if (person instanceof Pilot) {
            this.pilot = person;
            System.out.println(String.format("%s got in plane", person.getName()));
        }
        else {
            System.out.println("Are you a pilot?");
        }
    }

    @Override
    public void disembarkRider() {
        if(!isFlying) {
            pilot = null;
            System.out.println("Getting out of plane");
        }
        else{
            System.out.println("We need to land first!");
        }
    }
}
