package com.courses.lesson14;

import com.courses.lesson14.species.Bird;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class Parrot extends Bird {

    enum Color{
        RED, GREEN, BLUE, YELLOW, BLACK, WHITE
    }

    Color[] colors;


    public Parrot(Color... colors) {
        this.colors = colors;
    }

    @Override
    public void fly() {

    }

    @Override
    protected void voice() {

    }

    @Override
    protected Set<AnimalFood> addFood() {
        Set<AnimalFood> foodSet = new HashSet<>();
        foodSet.add(AnimalFood.INSECT);
        foodSet.add(AnimalFood.MEAT);
        foodSet.add(AnimalFood.WORM);
        return foodSet;
    }
}
