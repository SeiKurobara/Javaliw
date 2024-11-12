package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Future<Integer> future = new SquareCalculator().calculate(10);
        Future<Integer> future2 = new SquareCalculator().addition(2);
        int secs = 0;

        System.out.println("Start");
        System.out.println("Calculating");
        while (!future.isDone()){
            secs++;
            Thread.sleep(1000);
        }
        while (!future2.isDone()){
            secs++;
            Thread.sleep(1000);
        }

        System.out.println("Total Seconds: " + secs);
        System.out.println("End");
        Integer result = future.get();
        Integer result2 = future2.get();
        System.out.println("The Result is " + result);
        System.out.println("The Result2 is " + result2);

    }
}