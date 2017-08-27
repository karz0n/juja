package in.ua.denoming.juja.labs.lab29;

import in.ua.denoming.juja.shared.Tanker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TankerTest {
    @Test
    void test() {
        Tanker tanker = new Tanker("Ship 1", 125, 250, 50, 175);
        assertEquals(43750, tanker.calculatePayment());
        assertEquals(70000, tanker.calculatePayment(400));
    }
}
