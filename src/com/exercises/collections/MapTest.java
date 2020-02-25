package com.exercises.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        map.put("AA", 87);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC", 123);
        map1.put("DD", 123);

        map.putAll(map1);
        System.out.println(map);

        map.remove("CC");
        System.out.println(map);

//        map.clear();
        System.out.println(map.size());

        System.out.println(map.get("AA"));
        System.out.println(map.containsKey("BB"));
        System.out.println(map.containsValue("123"));
        System.out.println(map.containsValue(123));
        System.out.println(map.isEmpty());

        System.out.println("----------------------------------------------------");

        //Get all keys: keySet()
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println("----------------------------------------------------");

        //Get all values: values()
        Collection values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }

        System.out.println("----------------------------------------------------");

        //Get all entries: entrySet()
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
//            System.out.println(o);
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "----->" + entry.getValue());
        }
    }
}
