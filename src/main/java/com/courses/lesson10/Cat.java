package com.courses.lesson10;

/**
 * Created by ibilous on 05.11.2015.
 */
public class Cat extends Animal{

    Cat(String breed){
        super(breed);
    }

    /*@Override
    public String toString() {
        return breed;
    }*/

    @Override
    String voice() {
        return "Meow";
    }
}
