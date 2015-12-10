package com.courses.lesson10;

/**
 * Created by ibilous on 05.11.2015.
 */
public class Dog extends Animal {

    int age;

    Dog(String breed, int superAge){
        super(breed);
        age = superAge;
    }


   /* public String toString() {
        return breed;
    }
*/
    String voice(){
        return "bark";
    }


    int age(){
        return age;
    }
}
