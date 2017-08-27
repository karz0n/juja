package in.ua.denoming.juja.labs.lab20;

import java.util.Arrays;
import java.util.Collection;

class Permutator {
    static void permutation(int[] values, Collection<String> options) {
        Permutator.permutation(values, values.length, options);
    }

    private static void permutation(int[] values, int size, Collection<String> options) {
        if (size < 2) {
            options.add(Arrays.toString(values));
        } else {
            for (int k = 0; k < size; k++) {
                swap(values, k, size - 1);
                permutation(values, size - 1, options);
                swap(values, k, size - 1);
            }
        }
    }

    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
