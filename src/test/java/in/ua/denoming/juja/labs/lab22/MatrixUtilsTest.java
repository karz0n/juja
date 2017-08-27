package in.ua.denoming.juja.labs.lab22;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixUtilsTest {
    @Test
    void test0() {
        int[][] matrix = {
            {1}
        };

        int[][] output = MatrixUtils.rotateClockwise(matrix);

        assertArrayEquals(new int[]{1}, output[0]);
    }

    @Test
    void test1() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] output = MatrixUtils.rotateClockwise(matrix);

        assertArrayEquals(new int[]{7, 4, 1}, output[0]);
        assertArrayEquals(new int[]{8, 5, 2}, output[1]);
        assertArrayEquals(new int[]{9, 6, 3}, output[2]);
    }
}
