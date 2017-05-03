package in.ua.denoming.juja.labs.shared;

import java.util.Objects;

public class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);

        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
            + "name=" + getName()
            + ",countPages=" + getCountPages()
            + ",year=" + yearJournal
            + ",number=" + numberJournal + "}";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(yearJournal, numberJournal);
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other))
            return false;

        Journal journal = (Journal) other;
        return yearJournal.equals(journal.yearJournal) && numberJournal.equals(journal.numberJournal);
    }
}
