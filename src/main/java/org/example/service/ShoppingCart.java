package org.example.service;

import org.example.model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    // без скидки
    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food food : foods) {
            sum += food.getTotalPrice();
        }
        return sum;
    }

    // со скидкой
    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (Food food : foods) {
            double discount = 0;

            if (food instanceof org.example.model.Discountable) {
                discount = ((org.example.model.Discountable) food).getDiscount();
            }

            sum += food.getTotalPrice() * (1 - discount / 100);
        }
        return sum;
    }

    // только вегетарианские без скидки
    public double getVegetarianTotal() {
        double sum = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getTotalPrice();
            }
        }
        return sum;
    }
}