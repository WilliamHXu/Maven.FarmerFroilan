package com.zipcodewilmington.froilansfarm.CRUDsTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.FarmStuff.CRUDs;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CRUDsTest<T extends CRUDs, H> {


    public boolean addTest(T crud, Supplier<H> supplier){
        // Given
        H holder1 = supplier.get();
        H holder2 = supplier.get();
        H holder3 = supplier.get();
        ArrayList<H> expected = new ArrayList<H>();
        expected.add(holder1);
        expected.add(holder2);
        expected.add(holder3);
        // When
        crud.add(holder1);
        crud.add(holder2);
        crud.add(holder3);
        ArrayList<Chicken> actual = crud.get();
        // Then
        return expected.equals(actual);
    }

    public boolean removeTest(T crud, Supplier<H> supplier){
        // Given
        H holder1 = supplier.get();
        H holder2 = supplier.get();
        H holder3 = supplier.get();
        ArrayList<H> expected = new ArrayList<H>();
        expected.add(holder1);
        expected.add(holder3);
        // When
        crud.add(holder1);
        crud.add(holder2);
        crud.add(holder3);
        crud.remove(holder2);
        ArrayList<Chicken> actual = crud.get();
        // Then
        return expected.equals(actual);
    }

    public boolean removeAllTest(T crud, Supplier<H> supplier){
        // Given
        H holder1 = supplier.get();
        H holder2 = supplier.get();
        H holder3 = supplier.get();
        ArrayList<H> expected = new ArrayList<H>();
        // When
        crud.add(holder1);
        crud.add(holder2);
        crud.add(holder3);
        crud.removeAll();
        ArrayList<Chicken> actual = crud.get();
        // Then
        return expected.equals(actual);
    }
}
