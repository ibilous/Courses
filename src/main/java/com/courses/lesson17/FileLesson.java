package com.courses.lesson17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by ibilous on 03.12.2015.
 */
public class FileLesson {


    public static void main(String[] args) {
//        readExample();

//        fileExample();


//        throwExceptionMethod();


        randomExample();

    }

    private static void randomExample() {
        Random randomNumberGenerator = new Random();
        System.out.println(randomNumberGenerator.nextInt(9));
    }

    private static void fileExample() {
        File file = new File("testing.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.delete());
    }

    public static  void throwExceptionMethod() {
        try {
            throw new IOException("Some message");
        }catch (IOException dafkljghlsdfj){
            dafkljghlsdfj.printStackTrace();
        }
    }

    public void createFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("smth wrong");
        }
    }

    private static void readExample() {

        BufferedReader br = null;
        try {


            String sCurrentLine;

            File file = new File("C:\\testing.txt");
            if(file.exists()) {
                br = new BufferedReader(new FileReader(file));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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
