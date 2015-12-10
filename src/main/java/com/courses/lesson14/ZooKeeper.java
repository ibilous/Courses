package com.courses.lesson14;

import java.util.Map;
import java.util.Set;

/**
 * Created by ibilous on 19.11.2015.
 */
public class ZooKeeper {

    public static final int ENOUGH_ENERGY_FOR_ANIMAL = 40;
    String name;
    Map<AnimalFood, Double> foodFromStorage;

    public ZooKeeper(String name) {
        this.name = name;
        foodFromStorage = getFoodFromStorage();
    }

    public void feedAnimal(Animal animal){
        if(foodFromStorage != null){
            Set<AnimalFood> foodForCurrentAnimal = getFoodForAnimal(animal);
            for (AnimalFood animalFood : foodForCurrentAnimal) {
                Double kilosOfFoodPerAnimal = foodFromStorage.get(animalFood);
                if(animal.getAnimalEnergy() < ENOUGH_ENERGY_FOR_ANIMAL) {
                    if (kilosOfFoodPerAnimal > 0) {
                        while(animal.getAnimalEnergy() < ENOUGH_ENERGY_FOR_ANIMAL && kilosOfFoodPerAnimal > 0 ) {
                            double foodAmount = kilosOfFoodPerAnimal * 0.1 / 100;
                            animal.eat(animalFood, foodAmount);
                            kilosOfFoodPerAnimal = kilosOfFoodPerAnimal - foodAmount;
                            foodFromStorage.put(animalFood, kilosOfFoodPerAnimal);
                        }
                    }
                }
                if(animal.getAnimalEnergy() >= ENOUGH_ENERGY_FOR_ANIMAL){
                    break;
                }
            }
        }
    }

    private Set<AnimalFood> getFoodForAnimal(Animal animal){
        return animal.getFoodSet();
    }

    private Map<AnimalFood, Double> getFoodFromStorage()    {
        return Storage.getFood();
    }
}
