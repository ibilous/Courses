package com.courses.lesson10;

/**
 * Created by ibilous on 05.11.2015.
 */
public class Animal {

    String breed;
    Animal(String breed){
        this.breed = breed;
    }

    public String toString(){
        return breed;
    }

    String voice(){
        return "";
    }
}
