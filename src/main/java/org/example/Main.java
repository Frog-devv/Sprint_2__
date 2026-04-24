package org.example;

import org.example.model.Apple;
import org.example.model.Meat;
import org.example.service.ShoppingCart;
import org.example.model.constants.Colour;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);

        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        org.example.model.Food[] foods = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Вегетарианское без скидки: " + cart.getVegetarianTotal());
    }
}