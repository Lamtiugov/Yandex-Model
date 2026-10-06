package ru.yandex.praktikum.model.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart extends Food {
    public Food[] foods;

    public ShoppingCart(int count) {
        this.foods = new Food[count];
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
            double discount = (100 - foods[i].getDiscount()) / 100;
            sum = sum + foods[i].getPrice() * discount * foods[i].getAmount();
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