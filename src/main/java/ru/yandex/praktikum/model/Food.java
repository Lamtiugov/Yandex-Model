package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount; // количество продукта в килограммах
    protected double price;   // цена за единицу
    protected boolean isVegetarian;   // вегетарианский ли продукт

    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }

    public double getPrice() { return 0; }

    public int getAmount() {
        return 0;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}