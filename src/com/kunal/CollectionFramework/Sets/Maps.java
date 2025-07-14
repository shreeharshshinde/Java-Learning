package com.kunal.CollectionFramework.Sets;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 50);
        map.put("Charlie", 60);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(map.get("Alice"));
        System.out.println(map.getOrDefault("Gukesh", 34));
        System.out.println(map.containsKey("Bob"));
    }
}
