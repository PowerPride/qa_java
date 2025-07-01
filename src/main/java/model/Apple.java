package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    protected String colour;
    public Apple (int amount, double price){
        super(amount, price, false);
    }



    public byte Apple(String colour){
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED;
        }
        return Discount.ZERO;
    }
}
