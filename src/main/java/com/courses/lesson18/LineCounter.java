package com.courses.lesson18;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibilous on 08.12.2015.
 */
public class LineCounter implements Runnable {

    String fileStr;

    public LineCounter(String fileStr) {
        this.fileStr = fileStr;
    }

    private double readFileAndProcessLines() throws IOException {
        double count = 0D;
        File file = new File(fileStr);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                count += processLine(sCurrentLine);
            }
        }
        return count;
    }

    private double processLine(String line){
     /*   if(line.trim().equals("")){
            return 0;
        }
        return Double.valueOf(line);*/

        return line.trim().equals("") ? 0 : Double.valueOf(line);
    }

    @Override
    public void run() {
        try {
            double count = readFileAndProcessLines();
            System.out.println("file = "+fileStr+" count = "+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
