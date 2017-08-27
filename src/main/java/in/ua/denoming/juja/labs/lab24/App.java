package in.ua.denoming.juja.labs.lab24;

import in.ua.denoming.juja.shared.Book;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Some Name", 10, "Some Author");
        System.out.println(book);
    }
}
