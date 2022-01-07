package com.javadays;


/*
    all enumeration have two predefined methods
    values() and valueOf()
    values return an array contain constant list
 */
public class Sample3 {

    public static void main(String[] args) {

        Days[] daysOfTheWeek = Days.values();
        for (Days days : daysOfTheWeek){
            System.out.println(days);
            System.out.println("***********************");
        }
    }
}
