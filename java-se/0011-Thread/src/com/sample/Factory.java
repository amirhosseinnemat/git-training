package com.sample;

public class Factory extends Thread {

    @Override
    public void run() {


        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
