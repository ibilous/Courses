package com.courses.lesson14;

import java.util.Set;

/**
 * Created by ibilous on 19.11.2015.
 */
public abstract class Animal {
    double animalEnergy = 10;
    String name;
    private Set<AnimalFood> foodSet;
    int age;

    public Animal() {
        this.foodSet = addFood();
    }

    public double eat(AnimalFood food, double kilos){
        if(animalEnergy >= 100){
            return 100;
        }
        if(!foodSet.contains(food)){
            return animalEnergy;
        }
        int energyPerKilo = food.getEnergyPerKilo();
        return animalEnergy += kilos * energyPerKilo;
    }

    protected abstract void voice();

    protected abstract Set<AnimalFood> addFood();

    public Set<AnimalFood> getFoodSet() {
        return foodSet;
    }

    public double getAnimalEnergy() {
        return animalEnergy;
    }
}
