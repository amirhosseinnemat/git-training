package com.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // in hashmap we don't have duplicate key
        Map<String, String> countries = new HashMap<>();
        countries.put("ir", "iran");
        countries.put("uk", "united kingdom");
        countries.put("de", "germany");
        countries.put("fr", "france");
        countries.put(null, "russia");


        System.out.println(countries);
        System.out.println(countries.get("ir"));
        System.out.println(countries.values());
        System.out.println(countries.keySet());
        countries.replace("de", "deutschland");
        System.out.println(countries);

        // put if the key not presented
        countries.putIfAbsent("ir","ireland");




        System.out.println("*************************");

        Set set = countries.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }




        System.out.println("*************************");
        countries.forEach((x,y)-> System.out.println("country : " + x + " " + y));
        System.out.println("*************************");


        String x = "de";
        String z = "ir";
        String w = "uk";
        System.out.println(x.hashCode());
        System.out.println(z.hashCode());
        System.out.println(w.hashCode());
        System.out.println(x.hashCode() % 16);
        System.out.println(z.hashCode() % 16);
        System.out.println(w.hashCode() % 16);
        System.out.println("-------------------");

        String a = new String("ali");

        String b = new String("ali");
        String c = new String("ali");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println(2306996 % 16);


    }
}
