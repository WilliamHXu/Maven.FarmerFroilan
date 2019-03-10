package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CropDusterTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void makeNoiseTest() {

        CropDuster cropDuster = new CropDuster();
        cropDuster.makeNoise();
        String expected = "Hum and Roar!\n";
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void flyTest() {

        CropDuster cropDuster = new CropDuster();
        cropDuster.fly();

        boolean actual = cropDuster.getIsFlying();

        Assert.assertTrue(actual);

    }

    @Test
    public void operateTest() {

    }

    @Test
    public void fertilizeTest() {

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
