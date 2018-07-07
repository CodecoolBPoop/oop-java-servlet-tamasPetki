package com.codecool.servlet;

public class Item {
    int id;
    String name;
    double price;

    static int items_no = 0;

    Item(String name, double price) {
        items_no++;
        id = items_no;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
