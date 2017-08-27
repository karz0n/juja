package in.ua.denoming.juja.labs.lab31;

import in.ua.denoming.juja.shared.AbstractShip;

/**
 * juja: in.ua.denoming.juja.labs.lab31
 * User: DENIS
 * Date: 05.05.2017
 * Time: 22:38
 */
public interface SeaPortQueue {
    int LENGTH_QUEUE_SHIP = 3;
    int addShipToEndQueue(AbstractShip ship);
    int removeShipFromBeginQueue();
    String printQueueShip();
}
