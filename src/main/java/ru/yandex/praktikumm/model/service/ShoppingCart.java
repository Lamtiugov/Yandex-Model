package ru.yandex.praktikum.model.service;

import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.Apple;

public class ShoppingCart extends Food {
    public Food[] foods;
    private int count;

    public ShoppingCart(int count) {
        this.foods = new Food[count];
        this.count = count;
    }

    public double total() {
        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            sum = sum + foods[i].getPrice() * foods[i].getAmount();
        }
        return sum;
    }

    public double totalWithDiscount() {

        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            sum = sum + foods[i].getPrice() * (1 - foods[i].getDiscount()) * foods[i].getAmount();
        }
        return sum;
    }

    public double totalForVegetarian() {
        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sum = sum + foods[i].getPrice() * foods[i].getAmount();
            }
        }
        return sum;
    }
}