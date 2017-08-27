package in.ua.denoming.juja.labs.lab32;

import in.ua.denoming.juja.shared.AbstractShip;
import in.ua.denoming.juja.shared.Liner;
import in.ua.denoming.juja.shared.Tanker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OdessaSeaPortTest {
    @Test
    void testSortSumPaymentAsc() {
        AbstractShip[] ships = {
            new Liner("Ship1", 125, 250, 50, 175),
            new Tanker("ShipTanker1", 254, 120, 100, 60)
        };

        String expectedString = "ShipTanker1=15000.0Ship1=175000.0";
        String returnString = OdessaSeaPort.sortSumPaymentAsc(ships);
        assertEquals(expectedString, returnString);
    }
}
