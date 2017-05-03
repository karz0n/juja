package in.ua.denoming.juja.labs.lab24;

import in.ua.denoming.juja.labs.shared.Issue;
import in.ua.denoming.juja.labs.shared.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BookTest {
    @Test
    void testToString() {
        String testName = "Test Book";
        int testPageCount = 100;
        String testAuthor = "Brown J.";

        Issue testBook = new Book(testName, testPageCount, testAuthor);
        assertEquals(
            "Book{name=" + testName +",countPages=" + testPageCount + ",author=" + testAuthor + "}",
            testBook.toString());
    }
}
