package com.courses.lesson14;

import com.courses.lesson14.species.Herbivores;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class Antelope extends Herbivores {

    boolean hasHorns;

    public Antelope(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    @Override
    public void graze() {
        eat(AnimalFood.LEAF, 0.1);
    }

    @Override
    protected void voice() {

    }

    @Override
    protected Set<AnimalFood> addFood() {
        return new HashSet<AnimalFood>(){
            {
                add(AnimalFood.GRASS);
            }
        };
    }
}
