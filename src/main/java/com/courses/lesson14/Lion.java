package com.courses.lesson14;

import com.courses.lesson14.species.Predator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 19.11.2015.
 */
public class Lion extends Predator{


    public static final int AVERAGE_TEETH_LENGTH = 6;
    private boolean hasMane;

    public Lion(boolean hasMane) {
        super(AVERAGE_TEETH_LENGTH);
        this.hasMane = hasMane;
    }

    @Override
    public void hunt() {
        System.out.println("i am hunting");
    }

    @Override
    protected void voice() {
        System.out.println("roar");
    }

    @Override
    protected Set<AnimalFood> addFood() {
        Set<AnimalFood> foodSet = new HashSet<>();
        foodSet.add(AnimalFood.MEAT);
        foodSet.add(AnimalFood.BONE);
        return foodSet;
    }
}
