package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Farmer extends Person implements Rider, Botanist {

    public Farmer() { }


    public boolean eat(Edible food) {
        return true;
    }

    public void makeNoise() {
        String noise = "YeeHaw!";
        System.out.println(noise);
    }

    public void plant(Crop crop, CropRow row) {
        row.add(crop);
    }

    public void mount(Rideable rideable) {
        

    }

    public void dismount(Rideable rideable) {

    }


}
