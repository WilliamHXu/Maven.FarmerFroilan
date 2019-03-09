package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CornStalkTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @Test
    public void yieldYayTest(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        Edible edible = cornStalk.yield();
        boolean actual = edible instanceof EarCorn;
        Assert.assertTrue(actual);
    }

    @Test
    public void yieldNeighTest(){
        CornStalk cornStalk = new CornStalk();
        Edible edible = cornStalk.yield();
        Assert.assertNull(edible);
    }

    @Test
    public void fertilizeTest(){
        CornStalk cornStalk = new CornStalk();
        boolean expected1 = cornStalk.isFertilized();
        cornStalk.fertilize();
        boolean expected2 =  cornStalk.isFertilized();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }

    @Test
    public void harvestTest(){
        CornStalk cornStalk = new CornStalk();
        boolean expected1 = cornStalk.isHarvested();
        cornStalk.fertilize();
        cornStalk.yield();
        boolean expected2 =  cornStalk.isHarvested();
        Assert.assertFalse(expected1);
        Assert.assertTrue(expected2);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
