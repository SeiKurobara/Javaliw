package org.example;
public class Main {
    public static void main(String[] args){
        System.out.println("Main Branch");
        LambdaCollections lambdaCollections = new LambdaCollections();
        CallbackDriver<Double> callbackDriver = new CallbackDriver(lambdaCollections.displayResultDouble, 22d);

        double output = callbackDriver.executeCallback();
        System.out.println(output * 3);
    }
}