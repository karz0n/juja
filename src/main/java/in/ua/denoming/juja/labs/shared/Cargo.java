package in.ua.denoming.juja.labs.shared;

import in.ua.denoming.juja.labs.shared.AbstractShip;

/**
 * juja: in.ua.denoming.juja.labs.lab30
 * User: DENIS
 * Date: 05.05.2017
 * Time: 22:30
 */
@SuppressWarnings("WeakerAccess")
public class Cargo extends AbstractShip {
    public static final float DEFAULT_RENTAL = 250;
    private float tonnage;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return this.calculatePayment(DEFAULT_RENTAL);
    }

    public float calculatePayment(float rental) {
        if (rental == 0 || rental < 0) {
            rental = DEFAULT_RENTAL;
        }
        return tonnage * rental;
    }
}
