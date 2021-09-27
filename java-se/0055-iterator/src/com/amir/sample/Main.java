package com.amir.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    when i use iterator that i don't want
    play with index
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amir");
        names.add("Mohsen");
        names.add("Ali");
        // sort names with java Collections class
        Collections.sort(names);

        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Hello " + iterator.next());
        }


    } // end of main method
} // end of Main class
