package com.sample;

import java.util.Scanner;

public class Sample {



    public static void main(String[] args) {

        String stringNumber = "44";
        System.out.println(stringNumber + 6);
        System.out.println("************************");

        int number = 0;

        Scanner scanner = new Scanner(System.in);
        String stringNum2 = scanner.nextLine();
        // handling the exception for valid string number
        try{
            number = Integer.parseInt(stringNum2);
            System.out.println(number + 6);
        }catch (NumberFormatException e){
            System.out.println("unvalid input!");

        }


    }
}
