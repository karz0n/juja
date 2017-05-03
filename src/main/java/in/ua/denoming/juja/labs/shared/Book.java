package in.ua.denoming.juja.labs.shared;

public class Book extends Issue {
    private String author;

    public Book(String name, int countPages, String author) {
        super(name, countPages);

        this.author = author;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
            return false;

        Book other = (Book) otherObject;
        return author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + ",author=" + author + "}";
    }
}