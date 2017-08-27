package in.ua.denoming.juja.shared;

public interface ArrayRecorder<T extends Comparable<T>> extends Array<T> {
    void startRecord();
    void stopRecord();
    Statistic getStatistic();
}
