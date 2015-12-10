package com.courses.lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ibilous on 24.11.2015.
 */
public class ZooMain {


    static List<Animal> animals = new ArrayList<Animal>(){{
            add(new Bee(4, true));
            add(new Lion(true));
            add(new Lion(false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Ant(6, false));
            add(new Antelope(true));
            add(new Antelope(false));
            add(new Eagle());
            add(new Eagle());
            add(new Eagle());
            add(new Parrot(Parrot.Color.BLACK, Parrot.Color.BLUE, Parrot.Color.WHITE));
            add(new Parrot(Parrot.Color.RED, Parrot.Color.BLUE, Parrot.Color.GREEN));
            add(new Bee(4, true));
        }
    };


    public static void main(String[] args) {
        ZooKeeper willy = new ZooKeeper("Willy");
        for (Animal animal : animals) {
            animal.voice();
            System.out.println("energy before = " + animal.getAnimalEnergy());
            willy.feedAnimal(animal);
            System.out.println("energy after = " + animal.getAnimalEnergy());
        }


    }
}
