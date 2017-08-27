package in.ua.denoming.juja.labs.lab18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParserTest {
    @Test
    void test() {
        assertEquals(123, Parser.eval("123"));
        assertEquals(6, Parser.eval("2*3"));
        assertEquals(8, Parser.eval("(1+3)*2"));
    }
}
