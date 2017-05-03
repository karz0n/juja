package in.ua.denoming.juja.algorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * User: DENIS
 * Data: 06.03.2017
 * Time: 20:59
 */
class BubbleSortTest extends SortTest {
    private Sortable algorithm;
    private Array<Integer> dataToSort;
    private ArrayRecorder<Integer> recorder;

    @BeforeEach
    void setUp() {
        algorithm = new BubbleSorter();
        dataToSort = getDataForTesting(DEFAULT_MAX_COUNT, DEFAULT_MAX_VALUE);
        recorder = new BasicArrayRecorder<>(dataToSort);
    }

    @Test
    void testSort() {
        recorder.startRecord();
        algorithm.sort(recorder);
        recorder.stopRecord();
        print(algorithm, recorder);
        assertTrue(checkSortOrder(dataToSort));
    }
}
