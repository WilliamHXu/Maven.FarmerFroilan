package com.zipcodewilmington.froilansfarm.FarmStuff;

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


}
