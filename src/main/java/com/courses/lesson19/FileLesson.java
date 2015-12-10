package com.courses.lesson19;




import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;
import java.util.Random;

/**
 * Created by ibilous on 03.12.2015.
 */
public class FileLesson {


    public static void main(String[] args) {


        try (FileInputStream fileInputStream = new FileInputStream("C:\\proxies.txt");){
            List<String> strings = IOUtils.readLines(fileInputStream);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





    private static void readExample2() {

        File file = new File("C:\\testing.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
