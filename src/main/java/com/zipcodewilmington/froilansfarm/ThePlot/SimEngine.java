package com.zipcodewilmington.froilansfarm.ThePlot;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.People.Froilan;
import com.zipcodewilmington.froilansfarm.People.Froilanda;
import com.zipcodewilmington.froilansfarm.ThePlot.Days.*;

public class SimEngine {

    Farm farm;
    Froilan froilan = Froilan.getInstance();
    Froilanda froilanda = Froilanda.getInstance();

    public SimEngine(Farm farm) {
        this.farm = farm;
    }

    public void simFullWeek(){
        sunday();
        monday();
        tuesday();
        wednesday();
        thursday();
        friday();
        saturday();
    }

    public void sunday(){
        Sunday sunday = new Sunday();
        sunday.run(farm);
    }

    public void monday(){
        Monday monday = new Monday();
        monday.run(farm);
    }
    public void tuesday(){
        Tuesday tuesday = new Tuesday();
        tuesday.run(farm);
    }
    public void wednesday(){
        Wednesday wednesday = new Wednesday();
        wednesday.run(farm);
    }
    public void thursday(){
        sunday();
    }
    public void friday(){
        monday();
    }

    public void saturday(){
        tuesday();
    }
}
