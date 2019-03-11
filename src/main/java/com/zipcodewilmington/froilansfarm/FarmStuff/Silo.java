package com.zipcodewilmington.froilansfarm.FarmStuff;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.Set;
import java.util.TreeMap;

public class Silo {
    TreeMap<String, Integer> foodInSilo;

    public Silo(TreeMap<String, Integer> foodInSilo) {
        this.foodInSilo = foodInSilo;
    }

    public Silo() {
        foodInSilo = new TreeMap<>();
        String corn = EarCorn.class.getName();
        String tomato = Tomato.class.getName();
        String egg = Egg.class.getName();
        foodInSilo.put(corn, 500);
        foodInSilo.put(tomato, 100);
        foodInSilo.put(egg, 200);
    }

    public void addEdible(Edible edible){
        Set<String> keys = foodInSilo.keySet();
        String edibleName = edible.getClass().getName();
        boolean flag = false;
        for (String key : keys) {
            if (edibleName.equals(key)) {
                Integer temp = foodInSilo.get(key);
                foodInSilo.put(key, ++temp);
                flag = true;
                break;
            }
        }
        if (!flag) {
            foodInSilo.put(edibleName, 1);
        }
    }


    public boolean removeEdible(Edible edible){
        Set<String> keys = foodInSilo.keySet();
        String edibleName = edible.getClass().getName();
        boolean flag = false;
        for (String key : keys) {
            if (edibleName.equals(key)) {
                Integer temp = foodInSilo.get(key);
                foodInSilo.put(key, --temp);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public TreeMap<String, Integer> getFoodInSilo() {
        return foodInSilo;
    }

    @Override
    public String toString(){
        String result = "";
        Set<String> keys = foodInSilo.keySet();
        for (String key : keys){
            result += String.format("%d %ss in Silo\n", foodInSilo.get(key), key);
        }
        return result;
    }


}
