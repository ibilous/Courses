package com.courses.lesson13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ibilous on 17.11.2015.
 */
public class StaticExampleClass  {

    private final int count = 7;
    private final static int staticCount = 7;

    public static Map<String, Integer> animals= new HashMap<String, Integer>(){{
        put("CAT", 1);
        put("DOG", 4);
        put("Lion", 3);
    }};

    public StaticExampleClass() {
    }

    public int getCount(){
        return count;
    }


    public static void main(String[] args) {
        new StaticExampleClass();
        new StaticExampleClass();
        new StaticExampleClass();
        new StaticExampleClass();
        new StaticExampleClass();
        StaticExampleClass s = new StaticExampleClass();

        System.out.println(StaticExampleClass.staticCount);


    }
}
