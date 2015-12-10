package com.courses.lesson10;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("<empty>");
//        System.out.println(animal.toString());

        Dog superDog  = new Dog("superDog", 54);

        Animal dog = new Dog("spaniel", 12);
        ((Dog) dog).age();
//        System.out.println(dog.toString());

        Cat sphinx = new Cat("sphinx");


        printBreed(animal);
        printBreed(dog);
        printBreed(sphinx);

        voiceTest(animal);
        voiceTest(dog);
        voiceTest(sphinx);

    }

    static void printBreed(Animal animal){
        System.out.println(animal.toString());
    }

    static void voiceTest(Animal animal){
        System.out.println(animal.voice());
    }


}
