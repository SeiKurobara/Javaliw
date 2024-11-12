package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        System.out.println("Main Branch");

        int x = 2;
        int y = 3;

        Supplier<Integer> sampleSupplier = () -> x + y + x;
        Function<Integer,String> sampleFunction = a -> String.valueOf(a) ;
        System.out.println(sampleFunction.apply(55));

        Predicate<String> samplePrediate = a -> a.contains("e");
        System.out.println(samplePrediate.test("Hello"));
//        System.out.println(sampleSupplier.get());

        ILambdaReturnable<Integer> sampleComputation = new ILambdaReturnable<Integer>() {
            @Override
            public Integer returnvalue() {
                return x + y;
            }
        };
        System.out.println(sampleComputation.returnvalue());
        ILambdable sampleLambda = new ILambdable() {
            @Override
            public void compute() {
                System.out.println("This is a Sample Lambda");
            }
        };
        ILambdaReturnable<String> sampleReturnString = new ILambdaReturnable<String>() {
            @Override
            public String returnvalue() {
//                can access the outside variable
                return "This is a Sample String " + x;
            }
        };

        System.out.println(sampleReturnString.returnvalue());

//        sampleLambda.compute();
    }
}