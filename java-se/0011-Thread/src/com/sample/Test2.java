package com.sample;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Factory(), "baghali");
        Thread thread2 = new Thread(new Factory(), "mive foroshi");
        Thread thread3 = new Thread(new Factory(), "ghasabi");

        thread1.start();
        thread1.join();

        thread2.start();
        thread3.start();


    }
}
