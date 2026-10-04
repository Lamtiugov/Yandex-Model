package ru.yandex.praktikum.model;
package ru.yandex.praktikum.model.constants.*;

public class Apple extends Food, Apple{
//    String colour = "";
//        this.amount = amount;
//        this.price = price;
//        this.colour = ;

    Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Apple.isRed)) {
            return 60.0;
        }
        else {
            return  0.0;
        }
    }
}
