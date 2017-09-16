package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class BubbleFlaggedSorter implements Sorter {
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Array inputArray) {
        int size = inputArray.size();
        if (size <= 1) {
            return;
        }
        for (int j = 0; j < size - 1; j++) {
            boolean f = false;
            for (int i = 0; i < size - j - 1; i++) {
                if (inputArray.get(i).compareTo(inputArray.get(i + 1)) > 0) {
                    inputArray.swap(i, i + 1);
                    f = true;
                }
            }
            if (!f) {
                break;
            }
        }
    }
}
