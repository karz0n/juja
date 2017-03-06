package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.Array;
import in.ua.denoming.juja.Sortable;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 17:57
 */
public class BubbleSorter implements Sortable {
    public Array sort(Array array) {
        int size = array.size();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array.compareValue(j, j + 1) > 0) {
                    array.swap(j, j + 1);
                }
            }
        }

        return array;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
