package in.ua.denoming.juja.labs.lab26;

import in.ua.denoming.juja.shared.Issue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class LibraryTest {
    @Test
    void testPrintCatalog() {
        Issue[] issues = {
            new Issue("TestNameIssue1", 100),
            new Issue("TestNameIssue2", 50)
        };

        String expectedString = "Issue{name=TestNameIssue1,countPages=100};Issue{name=TestNameIssue2,countPages=50};";
        String actualString = Library.printCatalog(issues);

        assertNotNull(actualString);
        assertEquals(expectedString, actualString);
    }
}
