package in.ua.denoming.juja.labs.lab25;

import in.ua.denoming.juja.shared.Issue;
import in.ua.denoming.juja.shared.Journal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class JournalTest {
    @Test
    void testToPrint() {
        String testName = "Test Book";
        int testPageCount = 100;
        String testYear = "2017";
        String testNumber = "0";

        Issue testJournal = new Journal(testName, testPageCount, testYear, testNumber);

        String expectedString = String.format(
            "Journal{name=%s,countPages=%s,year=%s,number=%s}",
            testName, testPageCount, testYear, testNumber
        );
        String actualString = testJournal.toString();

        assertNotNull(actualString);
        assertEquals(expectedString, actualString);
    }
}
