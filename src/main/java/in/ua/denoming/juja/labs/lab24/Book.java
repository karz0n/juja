package in.ua.denoming.juja.labs.lab24;

class Book extends Issue {
    private String author;

    @SuppressWarnings("WeakerAccess")
    public Book(String name, int countPages, String author) {
        super(name, countPages);

        this.author = author;
    }

    public String toPrint() {
        return this.toString();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + ",author=" + author + "}";
    }
}