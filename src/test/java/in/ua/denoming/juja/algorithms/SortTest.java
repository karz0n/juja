package in.ua.denoming.juja.algorithms;

import java.util.Random;

/**
 * User: DENIS
 * Date: 03.03.2017
 * Time: 21:19
 */
abstract class SortTest {
    static final int DEFAULT_MAX_VALUE = 10000000;
    static final int DEFAULT_MAX_COUNT = 10000;

    BasicArray<Integer> getDataForTesting(int count, int maxValue) {
        Random engine = new Random();

        Integer[] output = new Integer[count];
        for (int i = 0; i < count; i++) {
            output[i] = engine.nextInt(maxValue);
        }

        return new BasicArray<>(output);
    }

    boolean checkSortOrder(Array<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.compareValue(i, i + 1) > 0) {
                return false;
            }
        }
        return true;
    }

    void print(Sortable algorithm, ArrayRecorder<?> recorder) {
        System.out.println("=========================================================\n");
        System.out.println("Algorithm '" + algorithm.toString() + "' recorded stats:\n");
        System.out.println(recorder.toString());
        System.out.println("=========================================================\n");
    }
}
