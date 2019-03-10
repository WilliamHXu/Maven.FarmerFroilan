package com.zipcodewilmington.froilansfarm.ThePlot.Days;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.FarmStuff.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Froilan;
import com.zipcodewilmington.froilansfarm.People.Froilanda;

import java.util.ArrayList;

public class DayOfWeek {

    static Froilan froilan = Froilan.getInstance();
    static Froilanda froilanda = Froilanda.getInstance();

    static final Edible[] froilanBreakfast = {new EarCorn(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg()};
    static final Edible[] froilandaBreakfast = {new EarCorn(), new EarCorn(), new Tomato(), new Egg(), new Egg()};
    static final Edible[] froilanLunch = {new EarCorn(), new EarCorn(), new Tomato(), new Tomato()};
    static final Edible[] froilandaLunch = {new EarCorn(), new Tomato()};
    static final Edible[] froilanDinner = {new EarCorn(), new EarCorn(), new Tomato(), new Tomato(), new Egg(), new Egg(), new Egg()};
    static final Edible[] froilandaDinner = {new EarCorn(), new EarCorn(), new EarCorn(), new Tomato()};

    public static void run(Farm farm){
        breakfast(farm);
        morning(farm);
        lunch(farm);
        afternoon(farm);
        dinner(farm);
    }

    public static void dinner(Farm farm) {
        // Froilan's Dinner
        mealHelper(froilan, froilanDinner, farm);
        // Froilanda's Dinner
        mealHelper(froilanda, froilandaDinner, farm);
    }

    public static void afternoon(Farm farm) {

    }

    public static void lunch(Farm farm) {
        // Froilan's Lunch
        mealHelper(froilan, froilanLunch, farm);
        // Froilanda's Lunch
        mealHelper(froilanda, froilandaLunch, farm);
    }

    public static void morning(Farm farm) {
        rideHorses(farm);
        grainHorses(farm);
    }


    public static void breakfast(Farm farm){
        // Froilan's Breakfast
        mealHelper(froilan, froilanBreakfast, farm);
        // Froilanda's Breakfast
        mealHelper(froilanda, froilandaBreakfast, farm);
    }

    protected static void mealHelper(Farmer farmer, Edible[] meal, Farm farm){
        for (Edible edible : meal){
            // Get from Silo
            if (farm.getSilo().removeEdible(edible)){
                farmer.eat(edible);
            }
            else{
                System.out.println(String.format("We ran out of %s", edible.getClass().getCanonicalName()));
            }
        }
    }

    protected static void rideHorses(Farm farm) {
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

    protected static void grainHorses(Farm farm) {
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
}
