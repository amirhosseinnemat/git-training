package com.amir.sample;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally always execute");
        }
    } // end of main method
} // end of Main class
