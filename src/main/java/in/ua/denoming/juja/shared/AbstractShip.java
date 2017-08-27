package in.ua.denoming.juja.shared;

import java.util.Comparator;

public abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{"
            + "Name=" + name
            + "Length=" + length
            + "Width=" + width
            + "Displacement=" + displacement + '}';
    }

    public static Comparator<AbstractShip> PaymentComparator = (o1, o2) -> (int) Math.signum(o1.calculatePayment() - o2.calculatePayment());
}
