package in.ua.denoming.juja.algorithms;

public class Element<T extends Comparable<T>> {
    private int index;
    private T value;

    @SuppressWarnings("WeakerAccess")
    public Element(int index, T value) {
        this.index = index;
        this.value = value;
    }

    @SuppressWarnings("WeakerAccess")
    public Element(Element<T> element) {
        this.index = element.index;
        this.value = element.value;
    }

    @SuppressWarnings("WeakerAccess")
    public int getIndex() {
        return index;
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
        return String.format("[%s=%s]", index, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Element<?> element = (Element<?>) obj;
        return index == element.index && (value != null
                ? value.equals(element.value)
                : element.value == null
        );
    }

    @SuppressWarnings("WeakerAccess")
    public int compareTo(Element<T> element) {
        return this.getValue().compareTo(element.getValue());
    }
}
