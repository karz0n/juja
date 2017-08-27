package in.ua.denoming.juja.shared;

public class Element<T extends Comparable<T>> {
    private int id;
    private T value;

    @SuppressWarnings("WeakerAccess")
    public Element(int id, T value) {
        this.id = id;
        this.value = value;
    }

    @SuppressWarnings("WeakerAccess")
    public Element(Element<T> element) {
        this.id = element.id;
        this.value = element.value;
    }

    @SuppressWarnings("WeakerAccess")
    public int getId() {
        return id;
    }

    @SuppressWarnings("WeakerAccess")
    public void setValue(T value) {
        this.value = value;
    }

    @SuppressWarnings("WeakerAccess")
    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("[%s=%s]", id, value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Element<?> element = (Element<?>) other;
        return id == element.id && (value != null
                ? value.equals(element.value)
                : element.value == null
        );
    }

    @SuppressWarnings("WeakerAccess")
    public int compareTo(Element<T> element) {
        return this.getValue().compareTo(element.getValue());
    }
}
