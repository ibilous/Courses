package com.courses.lesson11;

import java.util.ArrayList;

/**
 * Created by ibilous on 09.11.2015.
 */
public class MyArrayList extends ArrayList {

    void add(String s){
        super.add(s);
    }

    void add(int index, String s){
        super.add(index, s);
    }

    public void ensureCapacity(int minCapacity) {

    }





    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,"0");
        myArrayList.add("1");

    }
}
