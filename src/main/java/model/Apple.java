package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    public String colour;
    public Apple (int amount, double price, String colour){
        super(amount, price,true);
        this.colour = colour;

    }

    @Override
    public double getDiscount(){
        if (colour.equals(Colour.RED)) {
            return Discount.RED;
        }
        return Discount.ZERO;
    }
}
