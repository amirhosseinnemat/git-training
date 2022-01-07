package com.example.restsample;


import java.io.File;
import java.io.FileReader;

@FunctionalInterface
interface Salam{
    public void sayHello();
}

class Sample implements Salam{

    @Override
    public void sayHello() {
        System.out.println("salam");
    }
}


public class Test {
    public static void main(String[] args) {
        Salam salam = ()-> System.out.println("hello");
        salam.sayHello();
        new Test().show();

    }

    public void show(){
        Sample sample = new Sample();

    }
}
