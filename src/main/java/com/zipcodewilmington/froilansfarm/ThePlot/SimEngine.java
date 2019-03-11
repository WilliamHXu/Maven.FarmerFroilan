package com.zipcodewilmington.froilansfarm.ThePlot;

import com.zipcodewilmington.froilansfarm.FarmStuff.Farm;
import com.zipcodewilmington.froilansfarm.People.Froilan;
import com.zipcodewilmington.froilansfarm.People.Froilanda;
import com.zipcodewilmington.froilansfarm.ThePlot.Days.*;

public class SimEngine {

    Farm farm;
    Froilan froilan = Froilan.getInstance();
    Froilanda froilanda = Froilanda.getInstance();

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
        Sunday.run(farm);
    }

    public void monday(){
        Monday.run(farm);
    }
    public void tuesday(){
        Tuesday.run(farm);
    }
    public void wednesday(){
        Wednesday.run(farm);
    }
    public void thursday(){
        Sunday.run(farm);
    }
    public void friday(){
        Monday.run(farm);
    }

    public void saturday(){
        Tuesday.run(farm);
    }
}
