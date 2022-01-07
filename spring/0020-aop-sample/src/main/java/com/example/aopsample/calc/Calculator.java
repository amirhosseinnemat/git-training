package com.example.aopsample.calc;


import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public void add(){
        System.out.println("sum of 4 and 5 : " + (4+5));
    }
}
