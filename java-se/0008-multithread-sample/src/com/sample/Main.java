package com.sample;

public class Main {


    public static void main(String[] args) throws InterruptedException {



        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();



        //set name
        thread1.setName("one");
        thread2.setName("two");


        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();




        System.out.println(thread1.isAlive());
    }
}
