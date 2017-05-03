package in.ua.denoming.juja.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: DENIS
 * Date: 03.05.2017
 * Time: 13:30
 */
class IntegerUtilsTest {
    @Test
    void testLeftShift() {
        assertEquals(2, IntegerUtils.leftShift(1));
        assertEquals(1, IntegerUtils.leftShift(0x80000000));
    }

    @Test
    void testRightShift() {
        assertEquals(2, IntegerUtils.rightShift(4));
        assertEquals(0x80000000, IntegerUtils.rightShift(1));
    }

    @Test
    void testSwapBits() {
        assertEquals(8, IntegerUtils.swapBits((byte) 64, 6, 3));
        assertEquals(9, IntegerUtils.swapBits((byte) 24, 4, 0));
    }
}
