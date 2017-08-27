package in.ua.denoming.juja.shared;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumberUtilsTest {
    @Test
    void testInvert() {
        assertArrayEquals(new Integer[]{2, 1, 0}, NumberUtils.invert(new Integer[]{0, 1, 2}));
    }

    @Test
    void testFilterEven() {
        assertArrayEquals(new Integer[]{0, 2}, NumberUtils.filterEven(new Integer[]{0, 1, 2}));
    }

    @Test
    void testFilterOdd() {
        assertArrayEquals(new Integer[]{1}, NumberUtils.filterOdd(new Integer[]{0, 1, 2}));
    }

    @Test
    void testMergeSorted() {
        assertArrayEquals(new Integer[]{0,1,2,3,4,5}, NumberUtils.mergeSorted(
            new Integer[]{0, 1, 2}, new Integer[]{3, 4, 5})
        );
    }

    @Test
    void testLookForPositiveRange() {
        assertArrayEquals(new Integer[]{0, 2}, NumberUtils.lookForPositiveRange(new Integer[]{1, 1, 1}));
        assertArrayEquals(new Integer[]{1, 2}, NumberUtils.lookForPositiveRange(new Integer[]{0, 1, 1}));
        assertArrayEquals(new Integer[]{0, 1}, NumberUtils.lookForPositiveRange(new Integer[]{1, 1, 0}));
        assertArrayEquals(new Integer[]{2, 3}, NumberUtils.lookForPositiveRange(new Integer[]{0, -100, 1, 1, 0, -1}));
        assertArrayEquals(new Integer[]{0, 1}, NumberUtils.lookForPositiveRange(new Integer[]{1, 1, 0, 1, 1}));
        assertArrayEquals(new Integer[0], NumberUtils.lookForPositiveRange(new Integer[]{0, -1, 0, -1}));
    }
}
