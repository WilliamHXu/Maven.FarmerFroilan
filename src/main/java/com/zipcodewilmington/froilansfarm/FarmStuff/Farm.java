package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Field.Field;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field;
    private Silo silo;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse, Field field, Silo silo) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.field = field;
        this.silo = silo;
    }

    public Farm() {
        this(new ArrayList<Stable>(), new ArrayList<ChickenCoop>(), new FarmHouse(), new Field(), new Silo());
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
}
