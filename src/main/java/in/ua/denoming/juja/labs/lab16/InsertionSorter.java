package in.ua.denoming.juja.labs.lab16;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Element;
import in.ua.denoming.juja.shared.Sorter;

public class InsertionSorter implements Sorter {
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Array inputArray) {
        int size = inputArray.size();

        for (int i = 1; i < size; i++) {
            Element e = inputArray.get(i);
            int k = i - 1;
            while (k >= 0 && inputArray.get(k).compareTo(e) > 0) {
                inputArray.copy(k, k + 1);
                k--;
            }
            inputArray.set(k + 1, e);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
