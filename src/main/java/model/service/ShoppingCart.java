package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
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
            total += food.getAmount() * food.getPrice() * (1 - food.getDiscount() / 100.0);
        }
        return total;

    }

    public double getPriceWithAllVeganDishesWithoutDiscount(){
        double total = 0;
        for (Food food : foods) {

            if (food.isVegetarian()) {
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;

    }
}
    


