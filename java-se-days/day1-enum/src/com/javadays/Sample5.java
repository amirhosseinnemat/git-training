package com.javadays;

public class Sample5 {
    public static void main(String[] args) {
        System.out.println("ordinal value of enum Days");
        for (Days days : Days.values()) {
            System.out.println(days + " = " + days.ordinal());
        }
        System.out.println("*************************");

        // compare enum ordinal value with compareTo()
        Days day1 = Days.Saturday;
        Days day2 = Days.Friday;

        if ((day1.compareTo(day2)) < 0) {
            System.out.println(day1 + " comes before " + day2);
        } else if ((day1.compareTo(day2)) > 0) {
            System.out.println(day1 + " comes after " + day2);
        } else if ((day1.compareTo(day2)) == 0) {
            System.out.println("equal");
        }
        System.out.println("*************************");

        if (day1.equals(day2)) {
            System.out.println("equal");
        } else if (!(day1.equals(day2))){
            System.out.println("not equal");
        }
    }
}
