package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field;
    private Silo silo;
    private Tractor tractor;
    private CropDuster cropDuster;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse, Field field, Silo silo, Tractor tractor, CropDuster cropDuster) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.field = field;
        this.silo = silo;
        this.tractor = tractor;
        this.cropDuster = cropDuster;
    }

    public Farm() {
        this(new ArrayList<>(), new ArrayList<>(), new FarmHouse(), new Field(), new Silo(), new Tractor(), new CropDuster());
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void addStable(Stable stable) {
        this.stables.add(stable);
    }

    public void removeStable(Stable stable) {
        this.stables.remove(stable);
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void addChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoops.add(chickenCoop);
    }

    public void removeChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoops.remove(chickenCoop);
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo silo) {
        this.silo = silo;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }
}
