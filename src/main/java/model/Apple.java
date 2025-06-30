package model;

import model.constants.Discount;

public class Apple extends Food{
    protected String colour;
    public Apple (int amount, double price){
        super(amount, price, false);
    }
    //60% и все эти условия сюда впиливать чтоли, чет както не понятно
    @Override
    public Apple(String colour){
        if (colour == "red"){
            return ????;
        } else {

        }
    }
}
