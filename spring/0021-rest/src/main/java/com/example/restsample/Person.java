package com.example.restsample;

import net.minidev.json.annotate.JsonIgnore;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Person {


    String name;
    String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    List<String> persons = new ArrayList<>();




    public Person(){


        persons.add("ali");
        persons.add("kamal");

    }

    public static void main(String[] args) {
        System.out.println(new Person().persons);
    }


}
