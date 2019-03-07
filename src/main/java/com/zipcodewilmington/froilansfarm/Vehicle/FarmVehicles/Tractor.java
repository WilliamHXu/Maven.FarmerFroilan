package com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public Edible harvest(Crop crop){

        return crop.yield();
    }

    public void makeNoise() {

        String noise = "Vroom!";
        System.out.println(noise);
    }

    public void operate(Farm farm) {


    }
}
