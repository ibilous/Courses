package com.courses.lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by ibilous on 17.11.2015.
 */
public class Main {

    public static void main(String[] args) {

//        sortExample1();
//        sortExample2();
        staticExample();

    }

    private static void staticExample() {
        Map<String, Integer> animals = StaticExampleClass.animals;

        System.out.println(animals);
    }

    private static void sortExample2() {
        User masha = new User(1, "masha");
        User dasha = new User(2, "dasha");
        User pasha = new User(545, "pasha");
        User sasha = new User(89, "sasha");
        User sasha2 = new User(89, "asha");

        List<User> users = new ArrayList<>();
        users.add(masha);
        users.add(dasha);
        users.add(pasha);
        users.add(sasha);

        Collections.sort(users);
        System.out.println(users);
    }

    private static void sortExample1() {
        List<String> fruits = new ArrayList<>();

        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        Collections.sort(fruits);

        System.out.println(fruits);
    }
}
