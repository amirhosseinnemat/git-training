package com.amir.sample;

/*
in this sample i use static block for
initializing static variables
first static block execute before executing
main method
 */

class User {
    static String name;
    static int id;

    static {
        name = "Ali";
        id = 1244;
    } // end of static block
} // end of User class

public class Main {

    public static void main(String[] args) {

        System.out.println(User.name + " \n" + User.id);

    } // end of main method
} // end of Main class
