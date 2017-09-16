package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.BasicArray;
import in.ua.denoming.juja.shared.Sorter;

public class MergeSorter implements Sorter {
    private Array array;
    private Array tempArray;

    @Override
    public void sort(Array data) {
        array = data;
        int size = data.size();
        if (size <= 1) {
            return;
        }
        tempArray = new BasicArray<Integer>(size);
        doMergeSort(0, size - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    @SuppressWarnings("unchecked")
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray.set(i, array.get(i));
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray.get(i).compareTo(tempArray.get(j)) <= 0) {
                array.set(k, tempArray.get(i));
                i++;
            } else {
                array.set(k, tempArray.get(j));
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array.set(k, tempArray.get(i));
            k++;
            i++;
        }

    }
}
