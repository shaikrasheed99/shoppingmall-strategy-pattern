package com.tw.shoppingmall;

public class MondayDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.5;
    }
}
