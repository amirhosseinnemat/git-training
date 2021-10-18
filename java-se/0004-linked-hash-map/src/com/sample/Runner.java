package com.sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(2, "ali");
        linkedHashMap.put(3, "amir");
        linkedHashMap.put(1, "mahdi");
        linkedHashMap.put(null, "javad");


        System.out.println("Linked Hash Map");
        linkedHashMap.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("******************");
        // change order of linkedHashMap
        Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>(2, .75f, true);

        linkedHashMap2.put(2, "ali");
        linkedHashMap2.put(3, "amir");
        linkedHashMap2.put(1, "mahdi");
        linkedHashMap2.put(null, "javad");


        // order by last element used
        linkedHashMap2.get(3);
        linkedHashMap2.get(3);
        linkedHashMap2.get(2);

        System.out.println("Linked Hash Map - change order");
        linkedHashMap2.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("******************");

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(2, "ali");
        hashMap.put(3, "amir");
        hashMap.put(1, "mahdi");
        hashMap.put(null, "javad");

        System.out.println("Hash Map");
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));


    }
}
