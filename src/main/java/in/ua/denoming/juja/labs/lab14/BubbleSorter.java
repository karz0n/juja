package in.ua.denoming.juja.labs.lab14;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class BubbleSorter implements Sorter {
    public void sort(Array inputArray) {
        int size = inputArray.size();
        if (size <= 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (inputArray.compare(j, j + 1) > 0) {
                    inputArray.swap(j, j + 1);
                }
            }
        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
