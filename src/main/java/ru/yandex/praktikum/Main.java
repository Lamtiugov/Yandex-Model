package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,  100.0);
        Apple redApple = new Apple(10, 50, Colour.red);
        Apple greenApple = new Apple(8, 60, Colour.green);

        ShoppingCart shoppingCart = new ShoppingCart(3);

        shoppingCart.foods[0] = meat;
        shoppingCart.foods[1] = redApple;
        shoppingCart.foods[2] = greenApple;

        System.out.println(shoppingCart.total());
        System.out.println(shoppingCart.totalWithDiscount());
        System.out.println(shoppingCart.totalForVegetarian());
    }
}