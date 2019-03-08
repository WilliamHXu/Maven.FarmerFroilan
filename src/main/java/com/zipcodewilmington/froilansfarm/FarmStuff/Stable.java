package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable extends CRUDs<Horse>{

    public Stable() {
        objects = new ArrayList<Horse>();
    }
}
