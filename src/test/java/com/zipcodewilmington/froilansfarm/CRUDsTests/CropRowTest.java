package com.zipcodewilmington.froilansfarm.CRUDsTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void addTest(){
        CropRow cropRow = new CropRow();
        CRUDsTest<CropRow, CornStalk> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.addTest(cropRow, (CornStalk::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeTest(){
        CropRow cropRow = new CropRow();
        CRUDsTest<CropRow, CornStalk> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeTest(cropRow, (CornStalk::new));
        Assert.assertTrue(result);
    }

    @Test
    public void removeAllTest(){
        CropRow cropRow = new CropRow();
        CRUDsTest<CropRow, CornStalk> cruDsTest = new CRUDsTest<>();
        boolean result = cruDsTest.removeAllTest(cropRow, (CornStalk::new));
        Assert.assertTrue(result);
    }
}
