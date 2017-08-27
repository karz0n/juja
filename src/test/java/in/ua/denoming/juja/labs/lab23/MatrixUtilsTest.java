package in.ua.denoming.juja.labs.lab23;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixUtilsTest {
    @Test
    void test0() {
        int[][][] matrix = {
            {
                {1}
            }
        };

        int[][][] output = MatrixUtils.rotateClockwise(matrix);

        assertArrayEquals(new int[]{1}, output[0][0]);
    }

    @Test
    void test1() {
        int[][][] matrix = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        int[][][] output = MatrixUtils.rotateClockwise(matrix);

        assertArrayEquals(new int[]{1, 5}, output[0][0]);
        assertArrayEquals(new int[]{2, 6}, output[0][1]);
        assertArrayEquals(new int[]{3, 7}, output[1][0]);
        assertArrayEquals(new int[]{4, 8}, output[1][1]);
    }
}
