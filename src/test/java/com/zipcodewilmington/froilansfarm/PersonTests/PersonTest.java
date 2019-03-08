package com.zipcodewilmington.froilansfarm.PersonTests;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }



    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
