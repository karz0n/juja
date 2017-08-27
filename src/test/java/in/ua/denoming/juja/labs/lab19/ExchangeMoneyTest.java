package in.ua.denoming.juja.labs.lab19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExchangeMoneyTest {
    @Test
    void test() {
        assertEquals(1, ExchangeMoney.exchangeAmountOfCoinsBrutForce(1));
        assertEquals(2, ExchangeMoney.exchangeAmountOfCoinsBrutForce(2));
        assertEquals(4, ExchangeMoney.exchangeAmountOfCoinsBrutForce(5));
    }
}
