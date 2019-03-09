package com.zipcodewilmington.froilansfarm.FarmStuffTest;

import com.zipcodewilmington.froilansfarm.FarmStuff.*;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {

    @Test
    public void addStablesTest(){
        // Given
        Farm farm = new Farm();
        Stable stable = new Stable();
        farm.addStable(stable);
        ArrayList<Stable> expected = new ArrayList<>();
        // When
        expected.add(stable);
        ArrayList<Stable> actual = farm.getStables();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStablesTest(){
        // Given
        Farm farm = new Farm();
        Stable stable = new Stable();
        Stable stable1 = new Stable();
        farm.addStable(stable);
        farm.addStable(stable1);
        farm.removeStable(stable);
        ArrayList<Stable> expected = new ArrayList<>();
        // When
        expected.add(stable1);
        ArrayList<Stable> actual = farm.getStables();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addChickenCoopTest(){
        // Given
        Farm farm = new Farm();
        ChickenCoop chickenCoop = new ChickenCoop();
        farm.addChickenCoop(chickenCoop);
        ArrayList<ChickenCoop> expected = new ArrayList<>();
        // When
        expected.add(chickenCoop);
        ArrayList<ChickenCoop> actual = farm.getChickenCoops();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChickenCoopTest(){
        // Given
        Farm farm = new Farm();
        ChickenCoop chickenCoop = new ChickenCoop();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        farm.addChickenCoop(chickenCoop);
        farm.addChickenCoop(chickenCoop1);
        farm.removeChickenCoop(chickenCoop);
        ArrayList<ChickenCoop> expected = new ArrayList<>();
        // When
        expected.add(chickenCoop1);
        ArrayList<ChickenCoop> actual = farm.getChickenCoops();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFarmHouse(){
        // Given
        Farm farm = new Farm();
        FarmHouse farmHouse = new FarmHouse();
        Farmer farmer = new Farmer();
        // When
        farmHouse.add(farmer);
        farm.setFarmHouse(farmHouse);
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(farmHouse,actual);
    }

    @Test
    public void setField(){
        // Given
        Farm farm = new Farm();
        Field field = new Field();
        CropRow cropRow = new CropRow();
        // When
        field.add(cropRow);
        farm.setField(field);
        Field actual = farm.getField();
        // Then
        Assert.assertEquals(field, actual);
    }

    @Test
    public void setSilo(){
        // Given
        Farm farm = new Farm();
        Silo silo = new Silo();
        farm.setSilo(silo);
        Silo actual = farm.getSilo();
        Assert.assertEquals(silo, actual);
    }
}
