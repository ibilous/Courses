package com.courses.lesson14.species;

import com.courses.lesson14.Animal;

/**
 * Created by ibilous on 19.11.2015.
 */
public abstract class Predator extends Animal {

    int averageTeethLength;

    public Predator(int averageTeethLength) {
        super();
        this.averageTeethLength = averageTeethLength;
    }

    public abstract void hunt();
}
