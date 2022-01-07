package com.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        StringBuffer txt = new StringBuffer();
        txt.append("amir");
        txt.append("aaaaaaaaaaaaaaaaa");
        System.out.println(txt.capacity());
        System.out.println(txt);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("First");
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second");
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Third");
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {

                System.out.println("Fourth");
            }
        });

        executorService.shutdown();
    }
}
