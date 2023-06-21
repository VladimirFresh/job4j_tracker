package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Vasily Pupkin", "vasilypupkin@yahoo.com");
        map.put("Unknown User", "unknownuser@yahoo.com");
        map.put("Unknown User", "anothermail@yahoo.com");
        map.put("Vasily Pupkin", "moremails@yahoo.com");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
