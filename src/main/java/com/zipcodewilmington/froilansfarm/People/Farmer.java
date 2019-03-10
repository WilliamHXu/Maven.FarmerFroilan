package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Farmer extends Person implements Rider, Botanist, Eater {

    private boolean isMounted;

    public Farmer() {
        isMounted = false;
    }

    public Farmer(String name){
        super.name = name;
        isMounted = false;
    }

    public boolean eat(Edible food) {
        if (food != null) {
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

    public void mount(Rideable rideable) {
        isMounted = true;
        rideable.seatRider(this);
    }

    public void dismount(Rideable rideable) {
        isMounted = false;
        rideable.disembarkRider();
    }


    public boolean isNowMounted() {
        return isMounted;
    }

    public void setMounted(boolean isMounted) {
        this.isMounted = isMounted;
    }

    public void feedHorse(Horse horse){
        horse.eat(new EarCorn());
    }

}
