package in.ua.denoming.juja.labs.lab24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BookTest {
    @Test
    void testToPrint() {
        String testName = "Test Book";
        int testPageCount = 100;
        String testAuthor = "Brown J.";

        Issue testBook = new Book(testName, testPageCount, testAuthor);
        assertEquals(
            testBook.toPrint(),
            "Book{name=" + testName +",countPages=" + testPageCount + ",author=" + testAuthor + "}");
    }
}
