package com.javadays;

/*
    originally added by JDK5.
    enumeration define a class type and use with 'enum' keyword.
    enumeration can have constructor, methods, instance variable.

 */
public class Sample1 {

    // before we using enum
    final static String STATUS1 = "Online";
    final static String STATUS2 = "Offline";

    enum Status {
        Online, Offline
    }

    public static void main(String[] args) {
        System.out.println(STATUS1);

        Status st = Status.Online;
        System.out.println(st);

        // enum values can be compare by ==
        System.out.println(st == Status.Offline);
    }
}
