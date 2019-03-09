package com.zipcodewilmington.froilansfarm.CRUDsTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.FarmStuff.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;


public class ChickenCoopTest {

    @Test
    public void addTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        CRUDsTest<ChickenCoop, Chicken> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.addTest(chickenCoop, (Chicken::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        CRUDsTest<ChickenCoop, Chicken> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeTest(chickenCoop, (Chicken::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeAllTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        CRUDsTest<ChickenCoop, Chicken> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeAllTest(chickenCoop, (Chicken::new));
        Assert.assertTrue(result);
    }
}
