package in.ua.denoming.juja;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import in.ua.denoming.juja.algorithms.BubbleSorter;
import java.util.Random;

/**
 * User: DENIS
 * Data: 03.03.2017
 * Time: 21:19
 */
class SortTest {
    private static final int DEFAULT_MAX_VALUE = 10000000;
    private static final int DEFAULT_MAX_COUNT = 10000;

    @Test
    public void testAll() {
        Array<Integer> dataToSort = getDataForTesting(DEFAULT_MAX_COUNT, DEFAULT_MAX_VALUE);

        test(dataToSort, new BubbleSorter());
    }

    private void test(Array<Integer> dataToSort, Sortable algorithm) {
        Array<Integer> copy = copyArray(dataToSort);

        ArrayRecorder<Integer> recorder = new BasicArrayRecorder<>(copy);
        recorder.startRecord();
        algorithm.sort(recorder);
        recorder.stopRecord();
        print(algorithm, recorder);

        assertTrue(checkSortOrder(copy));
    }

    private BasicArray<Integer> getDataForTesting(int count, int maxValue) {
        Random engine = new Random();

        Integer[] output = new Integer[count];
        for (int i = 0; i < count; i++) {
            output[i] = engine.nextInt(maxValue);
        }

        return new BasicArray<>(output);
    }

    private boolean checkSortOrder(Array<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.compareValue(i, i + 1) > 0) {
                return false;
            }
        }
        return true;
    }

    private Array<Integer> copyArray(Array<Integer> array) {
        return new BasicArray<>(array);
    }

    private void print(Sortable algorithm, ArrayRecorder<?> recorder) {
        System.out.println("=========================================================\n");
        System.out.println("Algorithm '" + algorithm.toString() + "' recorded stats:\n");
        System.out.println(recorder.toString());
        System.out.println("=========================================================\n");
    }
}
