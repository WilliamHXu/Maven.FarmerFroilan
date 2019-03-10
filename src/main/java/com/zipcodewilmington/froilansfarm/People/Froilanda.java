package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Pilot;

public class Froilanda extends Farmer implements Pilot {

    private static Froilanda froilanda;

    private Froilanda(){}

    public static Froilanda getInstance(){
        if(froilanda == null){
            froilanda = new Froilanda();
        }
        return froilanda;
    }

//    public void operateAircraft() {
//
//    }

}


