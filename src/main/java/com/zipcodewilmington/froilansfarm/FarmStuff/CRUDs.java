package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public abstract class CRUDs<T>{
    ArrayList<T> objects;

    public void add(){}

    public void remove(T object){}

    public ArrayList<T> get(){return null;}
}
