package com.amir.sample;

public class Main {

    /*
    it's better to handle exception in upper methods
     */
    public static void main(String[] args) {
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception handled in main method");
        }
    } // end of main method

    public static void a() throws Exception {
        b();
    }
    public static void b() throws Exception {
        c();
    }
    public static void c() throws Exception{
        System.out.println(3/0);
    }
} // end of Main class
