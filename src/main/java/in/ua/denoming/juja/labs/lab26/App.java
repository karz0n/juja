package in.ua.denoming.juja.labs.lab26;

import in.ua.denoming.juja.shared.Issue;
import in.ua.denoming.juja.shared.Journal;
import in.ua.denoming.juja.shared.Book;

public class App {
    public static void main(String[] args) {
        Issue issues[] = {
            new Journal("Journal 1", 10, "2011", "10"),
            new Journal("Journal 2", 16, "2012", "11"),
            new Journal("Journal 3", 18, "2015", "12"),
            new Book("Book 1", 200, "Samuel")
        };
        System.out.println(Library.printCatalog(issues));
    }
}
