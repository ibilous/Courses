package com.courses.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by ibilous on 08.12.2015.
 */
public class Main {

    static List<String> files = new ArrayList<String>() {
        {
            add("C:\\courcess\\text1.txt");
            add("C:\\courcess\\text2.txt");
            add("C:\\courcess\\text3.txt");
            add("C:\\courcess\\text4.txt");
            add("C:\\courcess\\text5.txt");
        }
    };

    public static void main(String[] args) {


        long start = System.nanoTime();
        for (String file : files) {

            LineCounter lineCounter = new LineCounter(file);
            lineCounter.run();
        }
        System.out.println("non thread time = " + (System.nanoTime() - start));

        System.out.println("==============================================");

        for (String file : files) {

            Thread thread = new Thread(new LineCounter(file));
            thread.start();
        }

    }


    public static int getInt() {
        try {
            int i = 0;
            return i;

        } finally {
            return 5;
        }
    }
}
