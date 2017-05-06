package in.ua.denoming.juja.labs.shared;

import in.ua.denoming.juja.labs.shared.AbstractShip;

/**
 * juja: in.ua.denoming.juja.labs.lab29
 * User: DENIS
 * Date: 05.05.2017
 * Time: 22:23
 */
@SuppressWarnings("WeakerAccess")
public class Tanker extends AbstractShip {
    public static final float DEFAULT_RENTAL = 250;
    private float volume;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return this.calculatePayment(DEFAULT_RENTAL);
    }

    public float calculatePayment(float rental) {
        if (rental == 0 || rental < 0) {
            rental = DEFAULT_RENTAL;
        }
        return volume * rental;
    }
}
