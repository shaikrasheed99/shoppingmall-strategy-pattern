import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ShoppingMallTest {
    @Nested
    class WithoutStrategyPattern {
        @Test
        void shouldGiveTheNoDiscountBillWhenAmountIsGiven() {
            double amount = 1000;
            ShoppingMall shoppingMall = new ShoppingMall(amount);
            double expectedBillAmount = 1000;
            String discountString = "NO";

            double actualBillAmount = shoppingMall.getBill(discountString);

            assertThat(actualBillAmount, is(equalTo(expectedBillAmount)));
        }

        @Test
        void shouldGiveMondayDiscountBillWhenAmountIsGiven() {
            double amount = 1000;
            ShoppingMall shoppingMall = new ShoppingMall(amount);
            String discountString = "Monday";
            double expectedBillAmount = 500;

            double actualBillAmount = shoppingMall.getBill(discountString);

            assertThat(actualBillAmount, is(equalTo(expectedBillAmount)));
        }
    }
}
