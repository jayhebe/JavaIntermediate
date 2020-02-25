package com.exercises.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(76);
        list.add(89);
        list.add(98);

//        System.out.println(list);

        for (int score : list) {
            System.out.println(score);
        }

        System.out.println("-------------------------------------");

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Jay");
        map.put("age", "22");
        map.put("gender", "male");
        map.put("city", "Beijing");

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("-------------------------------------");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
