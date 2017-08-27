package in.ua.denoming.juja.shared;

public class Tanker extends AbstractShip {
    private static final float DEFAULT_RENTAL = 250;
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
