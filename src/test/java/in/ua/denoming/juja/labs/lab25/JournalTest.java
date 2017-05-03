package in.ua.denoming.juja.labs.lab25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JournalTest {
    @Test
    void testToPrint() {
        String testName = "Test Book";
        int testPageCount = 100;
        String testYear = "2017";
        String testNumber = "0";

        Issue testJournal = new Journal(testName, testPageCount, testYear, testNumber);
        assertEquals(
            testJournal.toString(),
            String.format("Journal{name=%s,countPages=%s,year=%s,number=%s}", testName, testPageCount, testYear, testNumber));
    }
}
