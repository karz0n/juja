package in.ua.denoming.juja.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 13:29
 */
public class Statistic {
    private Map<Operations, Integer> map = new HashMap<>();

    @SuppressWarnings("WeakerAccess")
    public void inc(Operations operation) {
        inc(operation, 1);
    }

    @SuppressWarnings("WeakerAccess")
    public void inc(Operations operation, int count) {
        init(operation);
        map.put(operation, map.get(operation) + count);
    }

    @SuppressWarnings("WeakerAccess")
    public int get(Operations operation) {
        init(operation);
        return map.get(operation);
    }

    private void init(Operations operation) {
        if (!map.containsKey(operation)) {
            map.put(operation, 0);
        }
    }

    public void reset() {
        map.clear();
    }

    @Override
    public String toString() {
        String output = "";

        output += "Operation [  GET]:\t" + get(Operations.GET) + '\n';
        output += "Operation [  SET]:\t" + get(Operations.SET) + '\n';
        output += "Operation [ SIZE]:\t" + get(Operations.SIZE) + '\n';
        output += "Operation [TOTAL]:\t" + (
                get(Operations.GET) + get(Operations.SET) + get(Operations.SIZE)
        ) + '\n';

        return output;
    }
}
