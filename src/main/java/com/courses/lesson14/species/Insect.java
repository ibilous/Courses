package com.courses.lesson14.species;

import com.courses.lesson14.Animal;

/**
 * Created by ibilous on 19.11.2015.
 */
public  abstract  class Insect extends Animal {

    private int legPairs;
    private boolean canFlight;

    public Insect(int legPairs, boolean canFlight) {
        super();
        this.legPairs = legPairs;
        this.canFlight = canFlight;
    }

    public abstract void work();
}
