public class ShoppingMall {
    private final double amount;

    public ShoppingMall(double amount) {
        this.amount = amount;
    }

    public double getBill(String discountString) {
        switch (discountString) {
            case "NO" : return 0;
            case "Monday" : return amount * 0.5;
        }
        return 0;
    }
}
