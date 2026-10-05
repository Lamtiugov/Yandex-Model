package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;

public abstract class Food implements Discountable {
    protected int amount; // количество продукта в килограммах
    protected double price;   // цена за единицу
    protected boolean isVegetarian;   // вегетарианский ли продукт
    protected String colour = Colour.defaultColour;

    public double getDiscount() {
        return 0.0;
    }

    public double getPrice() {
        return 0.0;
    }

    public int getAmount() {
        return 0;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}