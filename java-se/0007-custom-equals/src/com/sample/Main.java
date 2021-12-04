package com.sample;

public class Main {

    public static void main(String[] args) {


        // without equals
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        if (cat1.equals(cat2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        if (dog1.equals(dog2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
