package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Person;

public class Horse extends Animal implements Rideable {

    Person rider;

    public Horse() {
        rider = null;
    }

    public boolean eat(Edible food) {
        if (food instanceof EarCorn){
            return true;
        }
        else {
            return false;
        }
    }

    public void makeNoise() {
        String noise = "Neigh!";
        System.out.println(noise);
    }

    public void run(){
        if(rider != null){
            System.out.println("Coconut Noises");
        }
        else {
            makeNoise();
        }
    }

    @Override
    public void seatRider(Person person) {
        rider = person;
    }

    @Override
    public void disembarkRider() {
        rider = null;
    }
}
