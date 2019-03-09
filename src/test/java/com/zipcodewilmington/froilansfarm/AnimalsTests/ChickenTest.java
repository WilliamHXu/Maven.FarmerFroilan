package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ChickenTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void setFertilizedTest(){
        Chicken chicken = new Chicken();
        chicken.setFertilized(true);
        boolean actual = chicken.isFertilized();
        Assert.assertTrue(actual);
    }

    @Test
    public void eatCornTest(){
        Chicken chicken = new Chicken();
        Edible edible = new EarCorn();
        boolean actual = chicken.eat(edible);
        Assert.assertTrue(actual);
    }

    @Test
    public void eatNotCornTest(){
        Chicken chicken = new Chicken();
        Edible edible = new Tomato();
        boolean actual = chicken.eat(edible);
        Assert.assertFalse(actual);
    }

    @Test
    public void yieldYayTest(){
        Chicken chicken = new Chicken();
        Edible edible = chicken.yield();
        boolean actual = edible instanceof Egg;
        Assert.assertTrue(actual);
    }

    @Test
    public void yieldNeighTest(){
        Chicken chicken = new Chicken();
        chicken.setFertilized(true);
        Edible actual = chicken.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        chicken.makeNoise();
        String expected = "Cluck!\n";
        String actual = outContent.toString();
        Assert.assertEquals(expected , actual);
    }

    @Test
    public void makeNoise2Test(){
        Chicken chicken = new Chicken();
        chicken.makeNoise2();
        String expected = "BABOAK!\n";
        String actual = outContent.toString();
        Assert.assertEquals(expected , actual);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
