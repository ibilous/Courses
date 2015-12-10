package com.courses.lesson12;

/**
 * Created by ibilous on 12.11.2015.
 */
public class Main {

   /* public static void main(String[] args) {
        StringStatistic ss = getFullStatistic("dasfasdasd");
        ss.getLength();
        ss.getLongestWord();
    }
*/

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Fruit banana = new Banana();

        fruitTest(apple1);
        fruitTest(banana);
    }


    public static StringStatistic getFullStatistic(String str){

//        ......................

       /* ExtendedStringStatistic ess = new ExtendedStringStatistic("fkjasdfkjas dhlkjfhaskljsd hfkasdfas .df.a .sdf.a s.df");
        String longest = ess.longestWord();
        String smallest = ess.smallestWord();
        long length = ess.length();
*/
        StringStatistic ss = new StringStatistic();
        ss.setLength(242L);
        ss.setLongestWord("asdasdas");
        return ss;

    }

    private static  void fruitTest(Fruit fruit){
        System.out.println(fruit.getName());
        System.out.println(fruit.getCalory());
    }

}
