package com.zipcodewilmington.froilansfarm.PersonTests;

import com.zipcodewilmington.froilansfarm.People.Farmer;
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
    public void plantTest() {

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
