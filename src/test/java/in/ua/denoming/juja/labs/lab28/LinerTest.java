package in.ua.denoming.juja.labs.lab28;

import in.ua.denoming.juja.shared.Liner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LinerTest {
    @Test
    void test() {
        Liner liner = new Liner("Ship 1", 125, 250, 50, 175);
        assertEquals(175000, liner.calculatePayment());
        assertEquals(350000, liner.calculatePayment(2000));
    }
}
