package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class CocktailSorter implements Sorter {
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Array array) {
        int size = array.size();
        if (size <= 1) {
            return;
        }

        int left = 1;
        int right = size - 1;

        int last = size - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (array.get(i - 1).compareTo(array.get(i)) > 0) {
                    array.swap(i, i - 1);
                    last = i;
                }
            }
            left = last + 1;
            for (int i = left; i <= right; i++) {
                if (array.get(i - 1).compareTo(array.get(i)) > 0) {
                    array.swap(i, i - 1);
                    last = i;
                }
            }
            right = last - 1;
        } while (left <= right);
    }
}
