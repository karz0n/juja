package in.ua.denoming.juja;

import java.util.concurrent.TimeUnit;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 15:53
 */
public class BasicArrayRecorder<T extends Comparable<T>> implements ArrayRecorder<T> {
    private Array<T> array;
    private boolean record;
    private Statistic statistic;
    private long startRecordTimestamp;
    private long stopRecordTimestamp;

    @SuppressWarnings("WeakerAccess")
    public BasicArrayRecorder(Array<T> array) {
        this.array = array;
        this.statistic = new Statistic();
    }

    public int size() {
        if (record) {
            statistic.inc(Operations.SIZE);
        }
        return array.size();
    }

    public void swap(int index1, int index2) {
        if (record) {
            statistic.inc(Operations.GET, 2);
            statistic.inc(Operations.SET, 2);
        }
        array.swap(index1, index2);
    }

    public void startRecord() {
        startRecordTimestamp = System.nanoTime();
        stopRecordTimestamp = 0;
        record = true;
    }

    public void stopRecord() {
        stopRecordTimestamp = System.nanoTime();
        record = false;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public Element<T> get(int index) {
        if (record) {
            statistic.inc(Operations.GET);
        }
        return array.get(index);
    }

    public T set(int index, T value) {
        if (record) {
            statistic.inc(Operations.SET);
        }
        return array.set(index, value);
    }

    public Element<T> set(int index, Element<T> element) {
        if (record) {
            statistic.inc(Operations.SET);
        }
        return array.set(index, element);
    }

    public int compareValue(int index1, int index2) {
        if (record) {
            statistic.inc(Operations.GET, 2);
        }
        return array.compareValue(index1, index2);
    }

    public void copyValue(int fromIndex, int toIndex) {
        if (record) {
            statistic.inc(Operations.GET);
            statistic.inc(Operations.SET);
        }
        array.copyValue(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        String output = "";

        if (stopRecordTimestamp > startRecordTimestamp) {
            long difference = (stopRecordTimestamp - startRecordTimestamp);

            long seconds = TimeUnit.NANOSECONDS.toSeconds(difference);
            difference -=  TimeUnit.SECONDS.toNanos(seconds);

            long millis = TimeUnit.NANOSECONDS.toMillis(difference);
            difference -= TimeUnit.MILLISECONDS.toNanos(millis);

            long micros = TimeUnit.NANOSECONDS.toMicros(difference);
            difference -= TimeUnit.MICROSECONDS.toNanos(micros);

            output += "Elapsed record time: "
                    + seconds + " seconds, "
                    + millis + " millis, "
                    + micros + " micros, "
                    + difference + " nanos\n";
        }

        output += statistic.toString();

        return output;
    }
}
