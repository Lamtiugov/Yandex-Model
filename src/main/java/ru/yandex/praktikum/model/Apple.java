package ru.yandex.praktikum.model;

import java.util.Objects;

public class Apple extends Food{
    String colour = "";
    Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(colour, "red")) {
            return 60.0;
        }
        else {
            return  0.0;
        }
    }
}
