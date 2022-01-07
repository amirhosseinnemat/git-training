package com.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class FactoryRunner {


    public static void main(String[] args) {

        int counter = 4;


        ExecutorService executorService = Executors.newFixedThreadPool(counter);
//            ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        int i = 0;
        while (i < counter){
            executorService.execute(new Factory());
            i++;
        }


        executorService.shutdown();


    }
}
