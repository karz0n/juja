package in.ua.denoming.juja.labs.lab31;

import in.ua.denoming.juja.labs.shared.AbstractShip;

import java.util.Arrays;

/**
 * juja: in.ua.denoming.juja.labs.lab31
 * User: DENIS
 * Date: 08.05.2017
 * Time: 11:57
 */
class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] ships = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort + 1 >= LENGTH_QUEUE_SHIP) {
            return NO_SHIP_IN_ARRAY;
        }
        ships[++indexShipInPort] = ship;
        return indexShipInPort;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return NO_SHIP_IN_ARRAY;
        }

        if (indexShipInPort > 0) {
            ships = Arrays.copyOfRange(ships, 1, indexShipInPort + 1);
        } else {
            ships[0] = null;
        }
        indexShipInPort--;

        return 1;
    }

    @Override
    public String printQueueShip() {
        StringBuilder output = new StringBuilder();
        if (indexShipInPort != NO_SHIP_IN_ARRAY) {
            for (int i = 0; i <= indexShipInPort; i++) {
                output.append(ships[i].toString());
                output.append(";");
            }
        } else {
            output.append("QueueEmpty");
        }
        return output.toString();
    }
}
