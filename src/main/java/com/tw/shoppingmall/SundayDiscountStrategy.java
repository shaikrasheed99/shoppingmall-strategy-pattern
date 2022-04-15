package com.tw.shoppingmall;

public class SundayDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.75;
    }
}
