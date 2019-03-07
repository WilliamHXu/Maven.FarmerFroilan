package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Field.Field;

import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<FarmHouse> farmHouses;
    ArrayList<Field> fields;
    Silo silo;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, ArrayList<FarmHouse> farmHouses, ArrayList<Field> fields, Silo silo) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouses = farmHouses;
        this.fields = fields;
        this.silo = silo;
    }

    public Farm() {
        this(new ArrayList<Stable>(), new ArrayList<ChickenCoop>(), new ArrayList<FarmHouse>(), new ArrayList<Field>(), new Silo());
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

    public ArrayList<FarmHouse> getFarmHouses() {
        return farmHouses;
    }

    public void addFarmHouse(FarmHouse farmHouse) {
        this.farmHouses.add(farmHouse);
    }

    public void removeFarmHouse(FarmHouse farmHouse) {
        this.farmHouses.remove(farmHouse);
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public void removeField(Field field) {
        this.fields.remove(field);
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo silo) {
        this.silo = silo;
    }
}
