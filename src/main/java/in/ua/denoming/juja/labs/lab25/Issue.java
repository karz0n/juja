package in.ua.denoming.juja.labs.lab25;

public abstract class Issue {
    private String name;
    private int countPages;

    @SuppressWarnings("WeakerAccess")
    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    abstract public String toPrint();

    @Override
    public String toString() {
        return String.format("name=%s,countPages=%s", name, countPages);
    }
}
