package in.ua.denoming.juja.labs.lab24;

abstract class Issue {
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
        return "name=" + name + ",countPages=" + countPages;
    }
}

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

public class App {
    public static void main(String[] args) {
        Book book = new Book("name", 10, "author");
        System.out.println(book);
    }
}
