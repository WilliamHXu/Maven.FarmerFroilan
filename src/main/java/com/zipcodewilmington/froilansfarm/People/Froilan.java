package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Rider;

public class Froilan extends Farmer implements Botanist, Rider {

    private static Froilan froilan;

    private Froilan(){}

    public static Froilan getInstance(){
        if(froilan == null){
            froilan = new Froilan();
        }
        return froilan;
    }
}


