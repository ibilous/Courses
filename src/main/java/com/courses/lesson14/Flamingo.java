package com.courses.lesson14;

import com.courses.lesson14.species.Bird;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class Flamingo extends Bird {

    @Override
    public void fly() {
        System.out.println("i can fly coz i am flamingo");
    }

    @Override
    protected void voice() {
        System.out.println("flamingo's voice");
    }

    @Override
    protected Set<AnimalFood> addFood() {
        return  new HashSet<AnimalFood>(){
            {
                add(AnimalFood.FISH);
            }

        };
    }
}
