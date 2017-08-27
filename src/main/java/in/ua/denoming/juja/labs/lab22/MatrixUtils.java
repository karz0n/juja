package in.ua.denoming.juja.labs.lab22;

class MatrixUtils {
    static int[][] rotateClockwise(int[][] input) {
        if (input == null) {
            return null;
        }

        int width = input.length;
        if (width == 0) {
            return null;
        }

        for (int[] array : input) {
            if (array == null) {
                return null;
            }
            if (array.length != width) {
                return null;
            }
        }

        int[][] output = new int[input.length][input.length];
        if (input.length > 1) {
            for (int i = 0; i < input.length; i++) {
                for (int j = input.length - 1; j >= 0; j--) {
                    output[i][input.length - j - 1] = input[j][i];
                }
            }
        } else {
            output[0][0] = input[0][0];
        }
        return output;
    }
}
