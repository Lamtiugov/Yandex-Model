//package ru.yandex.praktikum.model.constants;
//package ru.yandex.praktikum.model.service;
package ru.yandex.praktikum.model;

public class Meat extends Food {
    private int amount;
    private double price;
    boolean isVegetarian = false;


    Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        boolean isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }
}