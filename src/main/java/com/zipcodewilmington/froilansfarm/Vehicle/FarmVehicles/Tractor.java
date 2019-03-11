package com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class Tractor extends Vehicle implements FarmVehicle {

    Person rider;

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
            edibles.addAll(Arrays.asList(edible));

        }
        field.clear();
        return edibles.toArray(new Edible[0]);
        }

    @Override
    public void seatRider(Person person) {
        if (person instanceof Farmer) {
            System.out.println(String.format("%s got on the tractor.", person.getName()));
            rider = person;
        }

    }

    @Override
    public void disembarkRider() {
        rider = null;
    }


    // @Override AtEquals method

    }

