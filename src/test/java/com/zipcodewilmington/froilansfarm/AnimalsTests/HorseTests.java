package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HorseTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void eatCornTest(){
        Horse horse = new Horse();
        Edible edible = new EarCorn();
        boolean actual = horse.eat(edible);
        Assert.assertTrue(actual);
    }

    @Test
    public void eatNotCornTest(){
        Horse horse = new Horse();
        Edible edible = new Tomato();
        boolean actual = horse.eat(edible);
        Assert.assertFalse(actual);
    }

    @Test
    public void makeNoiseTest(){
        Horse horse = new Horse();
        horse.makeNoise();
        String expected = "Neigh!\n";
        String actual = outContent.toString();
        Assert.assertEquals(expected , actual);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
