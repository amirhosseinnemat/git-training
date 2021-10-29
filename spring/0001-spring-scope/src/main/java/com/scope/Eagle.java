package com.scope;

public class Eagle implements Animal{


    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void movement() {
        System.out.println("Fly in the sky.");
    }
}
