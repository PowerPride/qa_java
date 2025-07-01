package model.service;

import model.Food;

public class ShoppingCart {
    public Food[] foods;

    public ShoppingCart(Food[] goods) {
        this.foods = foods;
    }

    public double getPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getAmount() * food.getPrice();
        }
        return total;
    }

    public double getPriceWithDiscount(){
        double total = 0;
        for (Food food : foods) {
            double discount = 1 - food.getDiscount() / 100.0;
            total += food.getAmount() * food.getPrice() * discount;
        }
        return total;

    }

    public double getPriceWithAllVeganDishesWithoutDiscount(){
        double total = 0;
        for (Food food : foods) {
            double discount = 1 - food.getDiscount() / 100.0;
            total += food.getAmount() * food.getPrice() * discount;
        }
        return total;

    }
}
    


