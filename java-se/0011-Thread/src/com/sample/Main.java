package com.sample;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                System.out.println("inside runnable");
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println("thread interrupted!");
                }
                System.out.println(Thread.currentThread().isAlive());
                System.out.println("done!");

            }
        });

        myThread.start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("second thread");
            }
        }).start();


    }
}
