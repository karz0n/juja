package in.ua.denoming.juja.shared;

public class Cargo extends AbstractShip {
    private static final float DEFAULT_RENTAL = 250;
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
