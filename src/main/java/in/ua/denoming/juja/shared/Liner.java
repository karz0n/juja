package in.ua.denoming.juja.shared;

public class Liner extends AbstractShip {
    private static final float DEFAULT_RENTAL = 1000;
    private int passengers;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return this.calculatePayment(DEFAULT_RENTAL);
    }

    public float calculatePayment(float rental) {
        if (rental == 0 || rental < 0) {
            rental = DEFAULT_RENTAL;
        }
        return passengers * rental;
    }
}
