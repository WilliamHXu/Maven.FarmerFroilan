package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TractorTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

@Test
    public void makeNoiseTest() {

    Tractor tractor = new Tractor();
    tractor.makeNoise();
    String expected = "Vroom!\n";
    String actual = outContent.toString();
    Assert.assertEquals(expected , actual);

    }

    public void operateTest() {

    }

    public void harvestTest(){

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
