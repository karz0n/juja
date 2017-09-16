package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

public class BubbleSelectionSorter implements Sorter {
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Array input) {
        int size = input.size();
        if (size <= 1) {
            return;
        }

        for (int j = 0; j < size - 1; j++) {
            boolean f = false;
            int min = j;
            for (int i = j; i < size - j - 1; i++) {
                if (input.get(i).compareTo(input.get(i + 1)) > 0) {
                    input.swap(i, i + 1);
                    f = true;
                }
                if (input.get(i).compareTo(input.get(min)) < 0) {
                    min = i;
                }
            }
            if (!f) {
                break;
            }
            if (min != j) {
                input.swap(j, min);
            }
        }
    }
}
