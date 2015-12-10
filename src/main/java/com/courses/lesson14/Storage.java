package com.courses.lesson14;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by ibilous on 19.11.2015.
 */
public class Storage {

    private static Map<AnimalFood, Double> storage = new EnumMap<AnimalFood, Double>(AnimalFood.class){
        {
            put(AnimalFood.BONE, 650D);
            put(AnimalFood.FISH, 250D);
            put(AnimalFood.FLOWER, 60D);
            put(AnimalFood.GRASS, 2000D);
            put(AnimalFood.INSECT, 5D);
            put(AnimalFood.LEAF, 5550D);
            put(AnimalFood.MEAT, 550D);
            put(AnimalFood.SUGAR, 50D);
            put(AnimalFood.WORM, 10D);
        }
    };

    public static Map<AnimalFood, Double> getFood(){
        return storage;
    }


}
