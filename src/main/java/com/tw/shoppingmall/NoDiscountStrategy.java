package com.tw.shoppingmall;

public class NoDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount;
    }
}
