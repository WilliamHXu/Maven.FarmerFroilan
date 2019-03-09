package com.zipcodewilmington.froilansfarm.CRUDsTests;



import com.zipcodewilmington.froilansfarm.FarmStuff.FarmHouse;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import org.junit.Assert;
import org.junit.Test;


public class FarmHouseTest {

    @Test
    public void addTest(){
        FarmHouse farmHouse = new FarmHouse();
        CRUDsTest<FarmHouse, Person> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.addTest(farmHouse, (Farmer::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeTest(){
        FarmHouse farmHouse = new FarmHouse();
        CRUDsTest<FarmHouse, Person> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeTest(farmHouse, (Farmer::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeAllTest(){
        FarmHouse farmHouse = new FarmHouse();
        CRUDsTest<FarmHouse, Person> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeAllTest(farmHouse, (Farmer::new));
        Assert.assertTrue(result);
    }
}
