package com.amir.se.loose;

public class Person {
    public static void main(String[] args) {
        Transport transport1 = new Bus();
//        Transport transport2 = new Train();

        Travel travel = new Travel(transport1);
        travel.start();

    }
}
