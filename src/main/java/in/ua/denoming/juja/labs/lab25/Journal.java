package in.ua.denoming.juja.labs.lab25;

import java.util.Objects;

public class Journal extends Issue {
    private String year;
    private String number;

    @SuppressWarnings("WeakerAccess")
    public Journal(String name, int countPages, String year, String number) {
        super(name, countPages);

        this.year = year;
        this.number = number;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
            return false;

        Journal other = (Journal) otherObject;
        return year.equals(other.year) && number.equals(other.number);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(year, number);
    }

    @Override
    public String toPrint() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("%s{%s,year=%s,number=%s}", getClass().getSimpleName(), super.toString(), year, number);
    }
}
