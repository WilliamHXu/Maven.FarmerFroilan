package com.zipcodewilmington.froilansfarm.CRUDsTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmStuff.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void addTest(){
        Stable stable = new Stable();
        CRUDsTest<Stable, Horse> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.addTest(stable, (Horse::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeTest(){
        Stable stable = new Stable();
        CRUDsTest<Stable, Horse> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeTest(stable, (Horse::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeAllTest(){
        Stable stable = new Stable();
        CRUDsTest<Stable, Horse> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeAllTest(stable, (Horse::new));
        Assert.assertTrue(result);
    }
}
