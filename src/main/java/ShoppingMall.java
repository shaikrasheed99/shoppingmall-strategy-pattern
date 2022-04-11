public class ShoppingMall {
    private final double amount;
    IDiscountStrategy discountStrategy;

    public ShoppingMall(double amount) {
        this.amount = amount;
    }

    public double getBill() {
        return discountStrategy.calculate(amount);
    }

    public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
