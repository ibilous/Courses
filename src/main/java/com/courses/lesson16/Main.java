package com.courses.lesson16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ibilous on 01.12.2015.
 */
public class Main {

    public static void main(String[] args) {
//        firstEqualsTest();


//        setEqualsTest();

        User petia1 = new User("Petia", 5);
        User petia2 = new User("Petia", 5);
        User vasia1 = new User("Vasia", 5);
        User vasia2 = new User("Vasia", 5);

        HashMap<User, Integer> userMap = new HashMap<>();
        userMap.put(petia1, 1);
        userMap.put(petia2, 2);
        userMap.put(vasia2, 4);


        System.out.println(userMap.get(vasia1));



    }

    private static void setEqualsTest() {
        User petia1 = new User("Petia", 5);
        User petia2 = new User("Petia", 5);
        User vasia1 = new User("Vasia", 5);


        Set<User> users =  new HashSet<>();
        users.add(petia1);
        users.add(petia2);
        users.add(vasia1);

        System.out.println(users.size());
    }

    private static void firstEqualsTest() {
        User galia = new User("Galia", 5);
        User galia2 = new User("Galia", 6);
        User galia3 = new User("Galia", 5);


        System.out.println(galia.equals(galia3));
    }

    public void ternarnaOperationTest(){
        int a = 3;
        int b;

        if(a  == 3){
            b = a;
        }else{
            b = 0;
        }

        b = a == 3 ? a : 0;
    }


    public void ternarnaOperationTest2(){
        int a = 3;
        int b;

        if(a  >= 3){
            if(a == 3 ){
                b = 3;
            }else {
                b = a;
            }
        }else{
            b = 0;
        }

        b = a > 3 ? a== 3 ? 3 : a : 0;
    }



}
