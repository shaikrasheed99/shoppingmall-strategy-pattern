public class ShoppingMall {
    private final double amount;

    public ShoppingMall(double amount) {
        this.amount = amount;
    }

    public double getBill(String discountString) {
        if (discountString.equals("NO")) {
            return amount;
        }
        return 0;
    }
}
