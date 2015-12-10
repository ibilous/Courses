package com.courses.lesson12;

/**
 * Created by ibilous on 12.11.2015.
 */
public class Banana implements Fruit {
    @Override
    public String getName() {
        return "Banana";
    }

    @Override
    public int getCalory() {
        return 50;
    }
}
