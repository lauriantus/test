package com.practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Object[] arr = new Object[4];
    String[] arrStr = new String[3];
    arrStr[0] = "str";

        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"str");
        map.put(2,"str");
        map.put(3,"str");
        map.put(3,"str");
        System.out.println("Map: " + map);
    }
}
