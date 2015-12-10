package com.courses.lesson14;

/**
 * Created by ibilous on 19.11.2015.
 */
public enum AnimalFood {

    GRASS(5),
    LEAF(5),
    MEAT(55),
    WORM(35),
    BONE(25),
    FISH(20),
    FLOWER(7),
    INSECT(25),
    SUGAR(99);

    private int energyPerKilo;
    AnimalFood(int energyPerKilo){
        this.energyPerKilo = energyPerKilo;
    }

    public int getEnergyPerKilo() {
        return energyPerKilo;
    }
}
