package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

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
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void operateTest() {
        Tractor tractor = new Tractor();
        Field field = new Field();
        Farm farm = new Farm(null, null,null, null, null);
        tractor.operate(farm);

       // Assert.assertEquals(expected , actual);
     }


    @Test
    public void harvestTest() {
        Tractor tractor = new Tractor();
        CropRow cropRow = new CropRow();
        Crop cornStalk1 = new CornStalk();
        Crop cornStalk2 = new CornStalk();
        Crop cornStalk3 = new CornStalk();
        Crop cornStalk4 = new CornStalk();

        cornStalk1.fertilize();
        cornStalk2.fertilize();
        cornStalk3.fertilize();
        cornStalk4.fertilize();

        cropRow.add(cornStalk1);
        cropRow.add(cornStalk2);
        cropRow.add(cornStalk3);
        cropRow.add(cornStalk4);

        Edible[] actual = tractor.harvest(cropRow);

        boolean flag = true;

        for (Edible edible : actual) {
            if (!(edible instanceof EarCorn)) {
                flag = false;
                break;
            }
        }

        Assert.assertTrue(flag);


    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
