package in.ua.denoming.juja.labs.shared;

public abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
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
        return getClass().getSimpleName() + "{"
            + "name='" + name + '\''
            + ", length=" + length
            + ", width=" + width
            + ", displacement=" + displacement + '}';
    }
}
