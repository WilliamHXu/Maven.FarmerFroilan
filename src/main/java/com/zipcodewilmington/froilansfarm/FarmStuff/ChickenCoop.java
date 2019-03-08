package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.ArrayList;

public class ChickenCoop extends CRUDs<Chicken>{

    public ChickenCoop() {
        objects = new ArrayList<Chicken>();
    }
}
