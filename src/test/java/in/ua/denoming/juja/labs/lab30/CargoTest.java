package in.ua.denoming.juja.labs.lab30;

import in.ua.denoming.juja.shared.Cargo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoTest {
    @Test
    void test() {
        Cargo cargo = new Cargo("Ship 1", 125, 250, 50, 175);
        assertEquals(43750, cargo.calculatePayment());
        assertEquals(70000, cargo.calculatePayment(400));
    }
}
