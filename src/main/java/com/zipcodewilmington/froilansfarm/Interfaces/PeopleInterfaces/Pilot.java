package com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public interface Pilot {
    // A pilot can operate aircraft
//    public void operateAircraft();

    void mount(Rideable rideable);

    void dismount(Rideable rideable);
}
