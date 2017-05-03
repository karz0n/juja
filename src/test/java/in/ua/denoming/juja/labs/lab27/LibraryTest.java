package in.ua.denoming.juja.labs.lab27;

import in.ua.denoming.juja.labs.shared.Issue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class LibraryTest {
    @Test
    void testGetIssueWithCountPagesMoreN() {
        Issue[] issues = {
            new Issue("TestNameIssue1", 100),
            new Issue("TestNameIssue2", 50),
            new Issue("TestNameIssue3", 0),
            new Issue("TestNameIssue4", 3),
        };

        String expectedPrint = "name=TestNameIssue1,countPages=100";
        String actualPrint = Library.getIssueWithCountPagesMoreN(issues, 50);
        assertNotNull(actualPrint);
        assertEquals(expectedPrint, actualPrint);
    }
}