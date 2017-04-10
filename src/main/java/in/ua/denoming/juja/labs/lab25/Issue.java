package in.ua.denoming.juja.labs.lab25;

import java.util.Objects;

public abstract class Issue {
    private String name;
    private int countPages;

    @SuppressWarnings("WeakerAccess")
    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;

        if (otherObject == null)
            return false;

        if (getClass() != otherObject.getClass())
            return false;

        Issue other = (Issue) otherObject;
        return name.equals(other.name) && countPages == other.countPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countPages);
    }

    abstract public String toPrint();

    @Override
    public String toString() {
        return String.format("name=%s,countPages=%s", name, countPages);
    }
}
