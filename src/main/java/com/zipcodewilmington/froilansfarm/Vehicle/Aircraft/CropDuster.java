package com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {



    public boolean isFlying = false;

    public void makeNoise() {

        String noise = "Hum and Roar!";
        System.out.println(noise);
    }

    public void fly() {

      isFlying = true;
    }

    public void operate(Farm farm) {


    }

    public void fertilize(CropRow cropRow){

    }

    public boolean getisFlying() {
        return isFlying;
    }
}
