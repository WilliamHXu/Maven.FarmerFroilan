package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Farmer extends Person implements Rider, Botanist, Eater {

    private boolean isMounted;
    String name;


    public Farmer() {
        isMounted = false;
    }

    public Farmer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean eat(Edible food) {
        if (food instanceof EarCorn || food instanceof Tomato || food instanceof Egg) {
            return true;
        } else {
            return false;
        }
    }


    public void makeNoise() {
        String noise = "YeeHaw!";
        System.out.println(noise);
    }

    public void plant(Crop crop, CropRow row) {
        row.add(crop);
    }

//    public void feedHorse() {
//    }

    public void mount(Rideable rideable) {
        isMounted = true;
    }

    public void dismount(Rideable rideable) {
        isMounted = false;
    }


    public boolean isNowMounted() {
        return isMounted;
    }

    public void setMounted(boolean isMounted) {
        this.isMounted = isMounted;
    }



}
