package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.SoybeanPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Soybean;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class SoybeanPlantTest {

    @Test
    public void yieldYayTest(){
        SoybeanPlant soybeanPlant = new SoybeanPlant();
        soybeanPlant.fertilize();
        Edible edible = soybeanPlant.yield();
        boolean actual = edible instanceof Soybean;
        Assert.assertTrue(actual);
    }

    @Test
    public void yieldNeighTest(){
        SoybeanPlant soybeanPlant = new SoybeanPlant();
        Edible edible = soybeanPlant.yield();
        Assert.assertNull(edible);
    }

    @Test
    public void fertilizeTest(){
        SoybeanPlant soybeanPlant = new SoybeanPlant();
        boolean expected1 = soybeanPlant.isFertilized();
        soybeanPlant.fertilize();
        boolean expected2 =  soybeanPlant.isFertilized();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }

    @Test
    public void harvestTest(){
        SoybeanPlant soybeanPlant = new SoybeanPlant();
        boolean expected1 = soybeanPlant.isHarvested();
        soybeanPlant.fertilize();
        soybeanPlant.yield();
        boolean expected2 =  soybeanPlant.isHarvested();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }
}
