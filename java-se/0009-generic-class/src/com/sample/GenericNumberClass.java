package com.sample;

public class GenericNumberClass<L extends Number, T extends Number> {

    L number1;
    T number2;

    public GenericNumberClass(L number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void showNumber() {
        System.out.println(number1.intValue() * number2.doubleValue());
    }
}
