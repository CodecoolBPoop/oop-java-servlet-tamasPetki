package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class ItemStore {

    static List<Item> listofitems = new ArrayList<Item>();

    public void add(Item item) {
        listofitems.add(item);
    }

    public void remove(Item item) {
        listofitems.remove(item);
    }

}
