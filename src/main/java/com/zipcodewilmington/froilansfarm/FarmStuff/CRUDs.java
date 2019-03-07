package com.zipcodewilmington.froilansfarm.FarmStuff;

import java.util.ArrayList;

public abstract class CRUDs<T>{
    ArrayList<T> objects;

    public void add(T object){objects.add(object);}

    public void remove(T object){objects.remove(object);}

    public ArrayList<T> get(){return objects;}

    public void removeAll(){objects.clear();}
}
