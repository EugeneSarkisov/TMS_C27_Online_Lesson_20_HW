package com.teachmeskills.lesson20.task1.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Class contain two methods for setting parameters in threads.
 */

public class ParametersGetter {
    public static String setParameterName(String path){
        String name = null;
        File paramFile = new File(path);
        try(BufferedReader paramReader = new BufferedReader(new FileReader(paramFile))){
            String line;
            while ((line = paramReader.readLine()) != null) {
                if (line.matches("^[\\D]{0,}$")) {
                    name = line;
                }
            }
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        return name;
    }

    public static int setParameterPriority(String path){
        int priority = 0;
        File paramFile = new File(path);
        try(BufferedReader paramReader = new BufferedReader(new FileReader(paramFile))){
            String line;
            while ((line = paramReader.readLine()) != null) {
                if (line.matches("\\d")) {
                    priority = Integer.parseInt(line);
                }
            }
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        return priority;
    }
}
