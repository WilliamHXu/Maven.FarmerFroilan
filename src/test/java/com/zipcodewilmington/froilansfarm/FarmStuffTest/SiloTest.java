package com.zipcodewilmington.froilansfarm.FarmStuffTest;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStuff.Silo;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class SiloTest {

    @Test
    public void addEdibleTest1(){
        // Given
        Silo silo = new Silo();
        EarCorn earCorn = new EarCorn();
        Tomato tomato = new Tomato();
        // When
        for (int i = 0; i < 5; i++) {
            silo.addEdible(earCorn);
            silo.addEdible(tomato);
        }
        TreeMap<String, Integer> expected = new TreeMap<>();
        expected.put("com.zipcodewilmington.froilansfarm.Edibles.EarCorn", 5);
        expected.put("com.zipcodewilmington.froilansfarm.Edibles.Tomato", 5);
        TreeMap<String, Integer> actual = silo.getFoodInSilo();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeEdibleTest1(){
        // Given
        Silo silo = new Silo();
        EarCorn earCorn = new EarCorn();
        Tomato tomato = new Tomato();
        // When
        for (int i = 0; i < 50; i++) {
            silo.addEdible(earCorn);
            silo.addEdible(tomato);
        }
        for (int i = 0; i < 30; i++) {
            silo.removeEdible(earCorn);
        }
        TreeMap<String, Integer> expected = new TreeMap<>();
        expected.put("com.zipcodewilmington.froilansfarm.Edibles.EarCorn", 20);
        expected.put("com.zipcodewilmington.froilansfarm.Edibles.Tomato", 50);
        TreeMap<String, Integer> actual = silo.getFoodInSilo();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
