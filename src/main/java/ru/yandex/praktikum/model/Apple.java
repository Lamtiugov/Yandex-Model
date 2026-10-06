package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

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
        if (this.colour.equals(Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        else return Discount.NO_DISCOUNT;
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
