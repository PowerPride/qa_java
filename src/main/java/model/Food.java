package model;

import model.constants.Discount;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price,boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return Discount.ZERO;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
