package in.ua.denoming.juja.shared;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

public class SorterTest {
    static private final int DEFAULT_MAX_VALUE = 10000;
    static private final int DEFAULT_MAX_COUNT = 1000;

    public static String testSortMethod(Sorter sortMethod, Array<Integer> input) {
        Array<Integer> arrayCopy = SorterTest.copyArray(input);

        ArrayRecorder<Integer> recorder = new BasicArrayRecorder<>(arrayCopy);
        recorder.startRecord();
        sortMethod.sort(recorder);
        recorder.stopRecord();

        assertTrue(validate(arrayCopy, input));

        return prepareOutputStats(sortMethod, recorder);
    }

    public static Array<Integer> getDataForTesting() {
        Random engine = new Random();

        Integer[] output = new Integer[DEFAULT_MAX_COUNT];
        for (int i = 0; i < DEFAULT_MAX_COUNT; i++) {
            output[i] = engine.nextInt(DEFAULT_MAX_VALUE);
        }

        return new BasicArray<>(output);
    }

    public static Array<Integer> getEmptyDataForTesting() {
        return new BasicArray<>(0);
    }

    private static boolean validate(Array<?> entity, Array<?> original) {
        String[] warnings;

        warnings = SorterValidator.validateSortOrder(entity);
        if (warnings.length > 0) {
            printWarnings(warnings);
            return false;
        }

        warnings = SorterValidator.validateItemsPresent(entity, original);
        if (warnings.length > 0) {
            printWarnings(warnings);
            return false;
        }

        return true;
    }

    private static Array<Integer> copyArray(Array<Integer> input) {
        return new BasicArray<>(input);
    }

    private static String prepareOutputStats(Sorter method, ArrayRecorder<?> recorder) {
        String output = "";
        output += "=========================================================\n";
        output += "Sort method class '" + method.toString() + "' stats:     \n";
        output += recorder.getStatistic().toString();
        output += "=========================================================\n";
        return output;
    }

    private static void printWarnings(String[] warnings) {
        for (String warning: warnings) {
            System.out.println(warning);
        }
    }
}
