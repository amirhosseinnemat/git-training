package com.javadays;


// each enumeration constant is an object of class in which it's defined.

public class Sample4 {
    enum Cars{
        Pride(50), Benz(120), Bmw(150), Paykan;

        private int price;

        Cars(int p) {
            price = p;
        }

        Cars(){
            price = -1;
        }

        public int getPrice(){
            return price;
        }

    }


    public static void main(String[] args) {

        Cars car1 = Cars.Benz;
        System.out.println("price of benz : " + car1.getPrice());

        Cars car2 = Cars.Paykan;
        System.out.println("Price of paykan : " + car2.getPrice());
    }
}
