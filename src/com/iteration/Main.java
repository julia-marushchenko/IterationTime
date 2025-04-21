// Java program to demonstrate time of foreach loop
package com.iteration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String [] str){

        // Creating list with integers
        List<Integer> list = new ArrayList<>();

        // Filling list with 1000000 numbers
        for(int index = 0; index < 1000000; index++){
            list.add(index);
        }

        // Time before foreach started
        long timeStart;
        // Time after foreach ended
        long timeEnd;


        timeStart = Calendar.getInstance().getTimeInMillis();

        // Iterating foreach
        for(Integer element : list){
            int number = element;
        }

        timeEnd = Calendar.getInstance().getTimeInMillis();

        System.out.println("Time of foreach iteration with 1000000 elements: " + (timeEnd - timeStart) + " ms");
    }
}
