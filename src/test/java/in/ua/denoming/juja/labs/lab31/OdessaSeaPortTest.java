package in.ua.denoming.juja.labs.lab31;

import in.ua.denoming.juja.shared.AbstractShip;
import in.ua.denoming.juja.shared.Liner;
import in.ua.denoming.juja.shared.Tanker;
import in.ua.denoming.juja.shared.Cargo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OdessaSeaPortTest {
    private OdessaSeaPort odessaSeaPort;

    @BeforeEach
    void setUp() {
        odessaSeaPort = new OdessaSeaPort();
    }

    @Test
    void testAddShipToEndQueue() {
        int queueIndex;

        AbstractShip ship1 = new Liner("Ship 1", 125, 250, 50, 175);
        AbstractShip ship2 = new Tanker("Ship Tanker 1", 254, 120, 100, 60);
        AbstractShip ship3 = new Cargo("Ship Tanker 1", 254, 120, 100, 60);

        queueIndex = odessaSeaPort.addShipToEndQueue(ship1);
        assertEquals(0, queueIndex);
        queueIndex = odessaSeaPort.addShipToEndQueue(ship2);
        assertEquals(1, queueIndex);
        queueIndex = odessaSeaPort.addShipToEndQueue(ship3);
        assertEquals(2, queueIndex);

        queueIndex = odessaSeaPort.addShipToEndQueue(ship1);
        assertEquals(-1, queueIndex);
    }

    @Test
    void testRemoveShipFromBeginQueue() {
        int resultIndex;

        resultIndex = odessaSeaPort.removeShipFromBeginQueue();
        assertEquals(-1, resultIndex);

        AbstractShip ship1 = new Liner("Ship 1", 125, 250, 50, 175);
        AbstractShip ship2 = new Tanker("Ship Tanker 1", 254, 120, 100, 60);
        AbstractShip ship3 = new Cargo("Ship Tanker 1", 254, 120, 100, 60);

        odessaSeaPort.addShipToEndQueue(ship1);
        odessaSeaPort.addShipToEndQueue(ship2);
        odessaSeaPort.addShipToEndQueue(ship3);

        resultIndex = odessaSeaPort.removeShipFromBeginQueue();
        assertEquals(1, resultIndex);
        resultIndex = odessaSeaPort.removeShipFromBeginQueue();
        assertEquals(1, resultIndex);
        resultIndex = odessaSeaPort.removeShipFromBeginQueue();
        assertEquals(1, resultIndex);

        resultIndex = odessaSeaPort.removeShipFromBeginQueue();
        assertEquals(-1, resultIndex);
    }

    @Test
    void testPrintQueueShip() {
        odessaSeaPort.addShipToEndQueue(new Liner("Ship 1", 125, 250, 50, 175));
        odessaSeaPort.addShipToEndQueue(new Tanker("Ship Tanker 1", 254, 120, 100, 60));

        String returnString = odessaSeaPort.printQueueShip();
        String expectedString = "{Name=Ship 1Length=125.0Width=250.0Displacement=50.0};{Name=Ship Tanker 1Length=254.0Width=120.0Displacement=100.0};";
        assertEquals(expectedString, returnString);
    }
}
