package ru.yandex.praktikum.model;

public abstract class Food implements Discountable {
    protected double amount; // количество продукта в килограммах
    protected int price;   // цена за единицу
    protected boolean isVegetarian;   // вегетарианский ли продукт

    public double getDiscount(){
        return 0.0;
    }
}