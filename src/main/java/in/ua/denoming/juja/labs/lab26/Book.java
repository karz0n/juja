package in.ua.denoming.juja.labs.lab26;

public class Book extends Issue {
    private String authorBook;

    Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
            "name=" + getName() +
            ",countPages=" + getCountPages() +
            ",author=" + authorBook + "}";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + authorBook.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other))
            return false;

        Book book = (Book) other;
        return authorBook.equals(book.authorBook);
    }
}
