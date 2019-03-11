package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.FarmStuff.Silo;
import com.zipcodewilmington.froilansfarm.FarmStuff.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Froilan;
import com.zipcodewilmington.froilansfarm.People.Froilanda;

import java.util.ArrayList;

public class DayOfWeek {

    Froilan froilan = Froilan.getInstance();
    Froilanda froilanda = Froilanda.getInstance();

    private final Edible[] froilanBreakfast = {new EarCorn(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg()};
    private final Edible[] froilandaBreakfast = {new EarCorn(), new EarCorn(), new Tomato(), new Egg(), new Egg()};
    private final Edible[] froilanLunch = {new EarCorn(), new EarCorn(), new Tomato(), new Tomato()};
    private final Edible[] froilandaLunch = {new EarCorn(), new Tomato()};
    private final Edible[] froilanDinner = {new EarCorn(), new EarCorn(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg()};
    private final Edible[] froilandaDinner = {new EarCorn(), new EarCorn(), new EarCorn(), new Tomato()};

    public DayOfWeek(){
    }

    public void run(Farm farm){
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
        showSilo(farm);
    }

    public void dinner(Farm farm) {
        // Froilan's Dinner
        mealHelper(froilan, froilanDinner, farm);
        // Froilanda's Dinner
        mealHelper(froilanda, froilandaDinner, farm);
    }

    public void afternoon(Farm farm) {

    }

    public void lunch(Farm farm) {
        // Froilan's Lunch
        mealHelper(froilan, froilanLunch, farm);
        // Froilanda's Lunch
        mealHelper(froilanda, froilandaLunch, farm);
    }

    public void morning(Farm farm) {
        rideHorses(farm);
        grainHorses(farm);
    }


    public void breakfast(Farm farm){
        // Froilan's Breakfast
        mealHelper(froilan, froilanBreakfast, farm);
        // Froilanda's Breakfast
        mealHelper(froilanda, froilandaBreakfast, farm);
    }

    protected void mealHelper(Farmer farmer, Edible[] meal, Farm farm){
        Silo silo = farm.getSilo();
        for (Edible edible : meal){
            // Get from Silo
            if (silo.removeEdible(edible)){
                farmer.eat(edible);
            }
            else{
                System.out.println(String.format("We ran out of %s", edible.getClass().getCanonicalName()));
            }
        }
    }

    protected void rideHorses(Farm farm) {
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables){
            ArrayList<Horse> horses = stable.get();
            for (Horse horse : horses){
                froilan.mount(horse);
                horse.run();
                froilan.dismount(horse);
            }
        }
    }

    protected void grainHorses(Farm farm) {
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables){
            ArrayList<Horse> horses = stable.get();
            for (Horse horse : horses){
                for (int i = 0; i < 3; i++) {
                    if (farm.getSilo().removeEdible(new EarCorn())) {
                        froilanda.feedHorse(horse);
                    }
                }
            }
        }
    }

    protected void showSilo(Farm farm){
        Silo silo = farm.getSilo();
        String string = silo.toString();
        System.out.println(string);
    }
}
