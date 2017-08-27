package in.ua.denoming.juja.labs.lab21;

class MatrixUtils {
    static int[][] multiply(int[][] left, int[][] right) {
        checkMatrix(left);
        checkMatrix(right);

        int leftHeight = getMatrixHeight(left);
        int leftWidth = getMatrixWidth(left);
        int rightWidth = getMatrixWidth(right);
        int rightHeight = getMatrixHeight(right);

        if (leftWidth != rightHeight) {
            throw new IllegalArgumentException();
        }

        int[][] output = new int[leftHeight][rightWidth];

        for (int m = 0; m < rightHeight; m++) {
            for (int n = 0; n < leftHeight; n++) {
                for (int k = 0; k < rightWidth; k++) {
                    output[n][k] += left[n][m] * right[m][k];
                }
            }
        }

        return output;
    }

    private static void checkMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException();
        }

        int width = getMatrixWidth(matrix);

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length != width) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static int getMatrixHeight(int[][] matrix) {
        return matrix.length;
    }

    private static int getMatrixWidth(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException();
        }

        return matrix[0].length;
    }
}
