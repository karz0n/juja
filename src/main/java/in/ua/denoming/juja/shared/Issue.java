package in.ua.denoming.juja.shared;

import java.util.Objects;

public class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
            + "name=" + getName()
            + ",countPages=" + getCountPages() + "}";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(name, countPages);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null)
            return false;

        if (getClass() != other.getClass())
            return false;

        Issue issue = (Issue) other;
        return name.equals(issue.name) && countPages == issue.countPages;
    }

    public int getCountPages() {
        return countPages;
    }

    @SuppressWarnings("WeakerAccess")
    public String getName(){
        return name;
    }
}