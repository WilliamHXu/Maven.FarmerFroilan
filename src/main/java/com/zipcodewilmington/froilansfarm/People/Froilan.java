package com.zipcodewilmington.froilansfarm.People;

public class Froilan extends Farmer {

    private static Froilan froilan;

    private Froilan(){}

    public static Farmer getInstance(){
        if(froilan == null){
            froilan = new Froilan();
        }
        return froilan;
    }
}


