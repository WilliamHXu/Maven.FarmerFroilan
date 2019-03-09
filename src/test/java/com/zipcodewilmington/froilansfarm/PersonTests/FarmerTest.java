package com.zipcodewilmington.froilansfarm.PersonTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FarmerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void makeNoiseTest() {
        Farmer farmer = new Farmer();
        farmer.makeNoise();
        String expected = "YeeHaw!\n";
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest(){
        Farmer farmer = new Farmer();
        Edible edible = new EarCorn();
        boolean actual = farmer.eat(edible);
        Assert.assertTrue(actual);
    }

    @Test
    public void eatTomatoTest(){
        Farmer farmer = new Farmer();
        Edible edible = new Tomato();
        boolean actual = farmer.eat(edible);
        Assert.assertTrue(actual);
    }

    @Test
    public void eatEggTest(){
        Farmer farmer = new Farmer();
        Edible edible = new Egg();
        boolean actual = farmer.eat(edible);
        Assert.assertTrue(actual);
    }

    @Test
    public void eatInedibleTest(){
        Farmer farmer = new Farmer();
        boolean actual = farmer.eat(null);
        Assert.assertFalse(actual);
    }



    @Test
    public void setMountedTest(){
        Farmer farmer = new Farmer();
        farmer.setMounted(true);
        boolean actual = farmer.isNowMounted();
        Assert.assertTrue(actual);
    }

    @Test
    public void mountTractorTest(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        farmer.mount(tractor);
        boolean actual = farmer.isNowMounted();
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountTractorTest(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        farmer.dismount(tractor);
        boolean actual = farmer.isNowMounted();
        Assert.assertFalse(actual);
    }

    @Test
    public void testConstructorWithName() {
        String expected = "Old MacLaughlin had a farm";
        Farmer farmer = new Farmer(expected);
        String actual = farmer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Farmer farmer = new Farmer();
        String expected = "Old MacLaughlin had a farm";
        farmer.setName(expected);
        String actual = farmer.getName();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void plantTest() {

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
