package com.zipcodewilmington.froilansfarm.ThePlot;


import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmStuff.*;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Froilan;
import com.zipcodewilmington.froilansfarm.People.Froilanda;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;

import java.util.ArrayList;

public class InitialStatePlot {
    Farm farm;

    public InitialStatePlot(){
        // Making Fields and empty croprows
        Field field = new Field();
        for (int i = 0; i < 5; i++) {
            field.add(new CropRow());
        }
        // Making Farmhouse and Farmers
        FarmHouse house = new FarmHouse();
        house.add(Froilan.getInstance());
        house.add(Froilanda.getInstance());
        // Making ChickenCoops and Chickens
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);
        chickenCoops.add(chickenCoop4);
        for(ChickenCoop coop : chickenCoops){
            for (int i = 0; i < 4; i++) {
                coop.add(new Chicken());
            }
        }
        // Making Stables and Horses
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        ArrayList<Stable> stables = new ArrayList<>();
        for (Stable stable : stables){
            for (int i = 0; i < 3; i++) {
                stable.add(new Horse());
            }
        }
        // Making silo
        Silo silo = new Silo();
        // Making Vehicles
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        // Putting everything in Farm
        farm = new Farm(stables, chickenCoops, house, field, silo, tractor, cropDuster);
    }

    public Farm getFarm() {
        return farm;
    }
}
