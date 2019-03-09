package com.zipcodewilmington.froilansfarm.Interfaces.PeopleInterfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public interface Rider {
    // Rider can mount a Rideable Object
    void mount(Rideable rideable);

    void dismount(Rideable rideable);
}
