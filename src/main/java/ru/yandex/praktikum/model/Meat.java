package ru.yandex.praktikum.service;
package ru.yandex.praktikum.model;

public class Meat extends Food {
    Meat(double amount, int price) {
        this.amount = amount;
        this.price = price;
        boolean isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }
}

