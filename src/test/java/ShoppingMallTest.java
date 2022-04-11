import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ShoppingMallTest {
    @Nested
    class WithStrategyPattern {
        @Test
        void shouldGiveTheNoDiscountBillWhenAmountIsGiven() {
            double amount = 1000;
            ShoppingMall shoppingMall = new ShoppingMall(amount);
            double expectedBillAmount = 1000;
            NoDiscountStrategy noDiscountStrategy = new NoDiscountStrategy();

            shoppingMall.setDiscountStrategy(noDiscountStrategy);
            double actualBillAmount = shoppingMall.getBill();

            assertThat(actualBillAmount, is(equalTo(expectedBillAmount)));
        }

        @Test
        void shouldGiveMondayDiscountBillWhenAmountIsGiven() {
            double amount = 1000;
            ShoppingMall shoppingMall = new ShoppingMall(amount);
            MondayDiscountStrategy mondayDiscountStrategy = new MondayDiscountStrategy();
            double expectedBillAmount = 500;

            shoppingMall.setDiscountStrategy(mondayDiscountStrategy);
            double actualBillAmount = shoppingMall.getBill();

            assertThat(actualBillAmount, is(equalTo(expectedBillAmount)));
        }
    }
}
