package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Froilanda;
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
        Froilanda froilanda = Froilanda.getInstance();
        froilanda.mount(cropDuster);
        cropDuster.fly();

        boolean actual = cropDuster.getIsFlying();

        Assert.assertTrue(actual);

    }

    @Test
    public void operateTest() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow1 = new CropRow();
        Crop cornStalk1 = new CornStalk();
        Crop cornStalk2 = new CornStalk();
        Crop cornStalk3 = new CornStalk();
        Crop cornStalk4 = new CornStalk();

        cropRow1.add(cornStalk1);
        cropRow1.add(cornStalk2);
        cropRow1.add(cornStalk3);
        cropRow1.add(cornStalk4);

        CropRow cropRow2 = new CropRow();
        Crop tomato1 = new TomatoPlant();
        Crop tomato2 = new TomatoPlant();
        Crop tomato3 = new TomatoPlant();
        Crop tomato4 = new TomatoPlant();

        cropRow2.add(tomato1);
        cropRow2.add(tomato2);
        cropRow2.add(tomato3);
        cropRow2.add(tomato4);

        Field field = new Field();
        field.add(cropRow1);
        field.add(cropRow2);

        Farm farm = new Farm();
        farm.setField(field);
        cropDuster.operate(farm);

        Edible[] actual = cropDuster.operate(farm);

        Assert.assertNull(actual);

    }

    @Test
    public void fertilizeTest() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();

        Crop cornStalk1 = new CornStalk();
        Crop cornStalk2 = new CornStalk();
        Crop cornStalk3 = new CornStalk();
        Crop cornStalk4 = new CornStalk();

        cropRow.add(cornStalk1);
        cropRow.add(cornStalk2);
        cropRow.add(cornStalk3);
        cropRow.add(cornStalk4);


        cropDuster.fertilize(cropRow);
        Boolean result = false;

        result = cornStalk1.isFertilized();

        Assert.assertTrue(result);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
