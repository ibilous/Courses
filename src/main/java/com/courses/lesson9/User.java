package com.courses.lesson9;

/**
 * Created by ibilous on 29.10.2015.
 */
public class User {

    long id;

    String name;
    String surname;

    int age;

    String city = "Lviv";

    User(String userName, String userSurname, int userAge){
        name = userName;
        age = userAge;
        surname = userSurname;
    }

/*
    com.courses.lesson9.User(int userAge){
        age = userAge;
    }*/

    String getName(){
        return name;
    }

    String fullName(){
        return name + " " + surname;
    }

    String fullNameWithAddParam(String addParam){
        return name + " " + surname + " " +addParam;
    }

    boolean isChild(){
        /*if(age < 18){
            return true;
        }
        return false;*/

        return age < 18;
    }





}
