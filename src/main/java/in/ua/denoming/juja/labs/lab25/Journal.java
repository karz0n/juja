package in.ua.denoming.juja.labs.lab25;

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
    public String toPrint() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("%s{%s,year=%s,number=%s}", getClass().getSimpleName(), super.toString(), year, number);
    }
}
