package in.ua.denoming.juja.labs.lab23;

class MatrixUtils {
    static int[][][] rotateClockwise(int[][][] input) {
        if (input == null) {
            return null;
        }

        int width = input.length;
        if (width == 0) {
            return null;
        }

        for (int[][] outer : input) {
            if (outer == null || outer.length != width) {
                return null;
            }
            for (int[] inner : outer) {
                if (inner == null || inner.length != width) {
                    return null;
                }
            }
        }

        int[][][] output = new int[input.length][input.length][input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    output[i][j][k] = input[k][i][j];
                }
            }
        }

        return output;
    }
}
