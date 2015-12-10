package com.courses.lesson13;

/**
 * Created by ibilous on 17.11.2015.
 */
public class ColorTest {

    /*public static int colorRed = 0;
    public static int colorGreen = 2;
    public static int colorBlu = 1;
*/
    public enum Color{
        RED, GREEN, BLUE, CYAN;
    }

    public static void main(String[] args) {
        Color color = Color.BLUE;

        Color cyan = Color.CYAN;

        colorMix(color, cyan);

        Color green = Color.valueOf("GREEN");


    }

    public static void colorMix(Color color111, Color color2){

    }


}
