package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yieldYayTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Edible edible = tomatoPlant.yield();
        boolean actual = edible instanceof Tomato;
        Assert.assertTrue(actual);
    }

    @Test
    public void yieldNeighTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible edible = tomatoPlant.yield();
        Assert.assertNull(edible);
    }

    @Test
    public void fertilizeTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        boolean expected1 = tomatoPlant.isFertilized();
        tomatoPlant.fertilize();
        boolean expected2 =  tomatoPlant.isFertilized();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }

    @Test
    public void harvestTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        boolean expected1 = tomatoPlant.isHarvested();
        tomatoPlant.fertilize();
        tomatoPlant.yield();
        boolean expected2 =  tomatoPlant.isHarvested();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }
}
