package com.sample;

public class Main {

    public static void main(String[] args) {

        Boolean bool = true;
        GenericClass genericClass = new GenericClass(bool);
        genericClass.showType();

        GenericNumberClass genericNumberClass = new GenericNumberClass(8,2);
        genericNumberClass.showNumber();

        System.out.println("Hello, world");

    }
}
