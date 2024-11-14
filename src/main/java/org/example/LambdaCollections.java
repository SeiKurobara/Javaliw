package org.example;

public class LambdaCollections {
    ICallBackable<Integer> callBackableInteger = x -> x + x;
    ICallBackable<String> displayResult = x -> x ;
    ICallBackable<Double> displayResultDouble = x -> x / 3 ;

}
