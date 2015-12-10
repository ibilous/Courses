package com.courses.lesson14;

import com.courses.lesson14.species.Insect;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class Ant extends Insect {


    public Ant(int legPairs, boolean canFlight) {
        super(legPairs, canFlight);
    }

    @Override
    public void work() {
        buildAnthill();
        gatherFoodForQueen();
    }

    private void buildAnthill(){

    }

    private void gatherFoodForQueen(){

    }

    @Override
    protected void voice() {

    }

    @Override
    protected Set<AnimalFood> addFood() {
        return new HashSet<AnimalFood>(){
            {
                add(AnimalFood.LEAF);
            }
        };
    }
}
