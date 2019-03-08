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

//    public void operateTest() {
//        Tractor tractor = new Tractor();
//        Field field = new Field();
//        Farm farm = new Farm(null, null,null, null, null);
//        tractor.operate(farm);
//
//        Assert.assertEquals(expected , actual);
//

    // }
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

        //ArrayList <Crop> crops = cropRow.get();

        //Edible[] actual = tractor.harvest(cropRow);

        //Edible earCorn1 = new EarCorn();

        Edible earCorn1 = cornStalk1.yield();
        Edible earCorn2 = cornStalk2.yield();
        Edible earCorn3 = cornStalk3.yield();
        Edible earCorn4 = cornStalk4.yield();

        Edible[] expected = {earCorn1, earCorn2, earCorn3, earCorn4};
//
//        ArrayList<CornStalk> corns = new ArrayList<CornStalk>();
//        corns.add(cornStalk1);
//        corns.add(cornStalk2);
//        corns.add(cornStalk3);
//        corns.add(cornStalk4);

        //EarCorn earCorn1 = cornStalk1.yield();

        //cropRow.get();

        Edible[] actual = tractor.harvest(cropRow);

        Assert.assertArrayEquals(expected, actual);


    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
