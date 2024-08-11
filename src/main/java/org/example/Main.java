package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Future<Integer> future = new SquareCalculator().calculate(10);
        int secs = 0;

        System.out.println("Start");
        System.out.println("Calculating");
        while (!future.isDone()){
            secs++;
            Thread.sleep(1000);
        }
        System.out.println("Total Seconds: " + secs);
        System.out.println("End");
        Integer result = future.get();
        System.out.println("The Result is " + result);


    }
}