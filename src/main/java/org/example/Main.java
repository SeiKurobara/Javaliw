package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args){
        System.out.println("Main Branch");
        CallbackDriver callbackDriver = new CallbackDriver(x -> x + " The task is Complete");
        System.out.println(callbackDriver.executeCallback());
    }
}