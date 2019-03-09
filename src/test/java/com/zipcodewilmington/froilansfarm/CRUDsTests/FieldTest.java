package com.zipcodewilmington.froilansfarm.CRUDsTests;

import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void addTest(){
        Field field = new Field();
        CRUDsTest<Field, CropRow> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.addTest(field, (CropRow::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeTest(){
        Field field = new Field();
        CRUDsTest<Field, CropRow> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeTest(field, (CropRow::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeAllTest(){
        Field field = new Field();
        CRUDsTest<Field, CropRow> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeAllTest(field, (CropRow::new));
        Assert.assertTrue(result);
    }
}
