package ru.yandex.praktikum.model.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart extends Food {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    //@Override Food
    public double getDiscountSum() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum = foods[i].getDiscount() * foods[i].price;
        }

        return sum;
    }