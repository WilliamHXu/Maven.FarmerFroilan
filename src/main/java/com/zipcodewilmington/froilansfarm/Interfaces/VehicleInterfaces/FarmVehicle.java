package com.zipcodewilmington.froilansfarm.Interfaces.VehicleInterfaces;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface FarmVehicle {
    // FarmVehicles operate on a farm
    Edible [] operate(Farm farm);
}
