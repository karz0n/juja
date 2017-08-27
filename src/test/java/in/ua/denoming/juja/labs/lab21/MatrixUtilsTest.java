package in.ua.denoming.juja.labs.lab21;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixUtilsTest {
    @Test
    void test() {
        int[][] left = {
            {1, 2},
            {7, 8},
            {3, 4}
        };

        int[][] right = {
            {3, 4, 5, 6},
            {9, 0, 1, 2}
        };

        int[][] output = MatrixUtils.multiply(left, right);

        assertArrayEquals(new int[]{21, 4, 7, 10}, output[0]);
        assertArrayEquals(new int[]{93, 28, 43, 58}, output[1]);
        assertArrayEquals(new int[]{45, 12, 19, 26}, output[2]);
    }
}
