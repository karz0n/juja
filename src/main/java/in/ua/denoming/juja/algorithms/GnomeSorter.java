package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class GnomeSorter implements Sorter {
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Array inputArray) {
        int size = inputArray.size();
        if (size <= 1) {
            return;
        }

        int i = 1;
        int j = 2;
        while (i < size) {
            if (inputArray.get(i - 1).compareTo(inputArray.get(i)) <= 0) {
                i = j;
                j = j + 1;
            } else {
                inputArray.swap(i - 1, i);
                i = i - 1;
                if (i == 0) {
                    i = j;
                    j = j + 1;
                }
            }
        }
    }
}
