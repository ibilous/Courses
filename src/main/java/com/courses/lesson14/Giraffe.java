package com.courses.lesson14;

import com.courses.lesson14.species.Herbivores;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class Giraffe extends Herbivores {

    int neckLength;

    public int getSpotCount(){
        return new Random().nextInt(10000)+1000;
    }

    @Override
    public void graze() {
        eat(AnimalFood.GRASS, 0.1);
        eat(AnimalFood.LEAF, 0.1);
    }

    @Override
    protected void voice() {

    }

    @Override
    protected Set<AnimalFood> addFood() {
        return new HashSet<AnimalFood>(){
            {
                add(AnimalFood.LEAF);
                add(AnimalFood.GRASS);
            }
        };
    }
}
