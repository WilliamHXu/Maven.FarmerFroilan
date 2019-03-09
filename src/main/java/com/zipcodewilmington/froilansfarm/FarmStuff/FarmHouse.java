package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.ArrayList;

public class FarmHouse extends CRUDs<Person>{

    public FarmHouse() {
        objects = new ArrayList<Person>();
    }
}
