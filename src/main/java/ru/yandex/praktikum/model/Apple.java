package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour =colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.red)) {
            return 0.60;
        }
        else if (this.colour.equals(Colour.green)) {
            return 0.0;
        }
        else return 0.0;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }
}
