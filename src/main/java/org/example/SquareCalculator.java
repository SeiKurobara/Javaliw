package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input){
        return executorService.submit(()->{
            Thread.sleep(5000);
            return input * input;
        });
    }
}
