package in.ua.denoming.juja.labs.lab32;

import in.ua.denoming.juja.labs.shared.AbstractShip;
import in.ua.denoming.juja.labs.shared.Liner;
import in.ua.denoming.juja.labs.shared.Tanker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * juja: in.ua.denoming.juja.labs.lab32
 * User: DENIS
 * Date: 08.05.2017
 * Time: 13:05
 */
@SuppressWarnings("WeakerAccess")
public class OdessaSeaPortTest {
    @Test
    void testSortSumPaymentAsc() {
        AbstractShip[] ships = {
            new Liner("Ship1", 125, 250, 50, 175),
            new Tanker("ShipTanker1", 254, 120, 100, 60)
        };

        String expectedString = "Ship1=175000.0;ShipTanker1=15000.0;";
        String returnString = OdessaSeaPort.sortSumPaymentAsc(ships);
        assertEquals(expectedString, returnString);
    }
}
