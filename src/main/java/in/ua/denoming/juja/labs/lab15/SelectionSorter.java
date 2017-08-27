package in.ua.denoming.juja.labs.lab15;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class SelectionSorter implements Sorter {
    @Override
    public void sort(Array inputArray) {
        int size = inputArray.size();

        int index;
        for (int i = 0; i < size - 1; i++) {
            index = i;
            for (int j = i + 1; j < size; j++) {
                if (inputArray.compare(index, j) > 0) {
                    index = j;
                }
            }
            if (index != i) {
                inputArray.swap(index, i);
            }
        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
