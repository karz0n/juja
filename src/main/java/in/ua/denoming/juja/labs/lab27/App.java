package in.ua.denoming.juja.labs.lab27;

import in.ua.denoming.juja.labs.shared.Book;
import in.ua.denoming.juja.labs.shared.Issue;
import in.ua.denoming.juja.labs.shared.Journal;

public class App {
    public static void main(String[] args) {
        Issue issues[] = {
            new Journal("Journal 1", 10, "2011", "10"),
            new Journal("Journal 2", 16, "2012", "11"),
            new Journal("Journal 3", 18, "2015", "12"),
            new Book("Book 1", 200, "Samuel")
        };
        System.out.println(Library.getIssueWithCountPagesMoreN(issues, 16));
    }
}
