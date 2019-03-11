package com.zipcodewilmington.froilansfarm.ThePlot;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;

public class Simulation {

    Farm farm;

    public Simulation(){
        InitialStatePlot initialStatePlot = new InitialStatePlot();
        farm = initialStatePlot.getFarm();
    }

    public void runSimulation(){
        SimEngine simEngine = new SimEngine();
        simEngine.simFullWeek();
    }
}
