package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] newArray = new Item[size];
        int index;
        for (index = 0; index < size; index++) {
            if (items[index] != null) {
                newArray[index] = items[index];
                index++;
            }
        }
        newArray = Arrays.copyOf(items, index);
        return newArray;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int len = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                len++;
                rsl[index] = items[index];
            }
        }
        rsl = Arrays.copyOf(items, len);
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}