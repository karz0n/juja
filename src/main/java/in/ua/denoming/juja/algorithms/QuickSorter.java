package in.ua.denoming.juja.algorithms;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Element;
import in.ua.denoming.juja.shared.Sorter;

public class QuickSorter implements Sorter {
    @Override
    public void sort(Array array) {
        int size = array.size();
        if (size <= 1) {
            return;
        }
        qSort(array, 0, size - 1);
    }

    @SuppressWarnings("unchecked")
    private static void qSort(Array data, int low, int high) {
        int i = low;
        int j = high;
        Element x = data.get((low + high) / 2);  // x - опорный элемент посредине между low и high
        do {
            while (data.get(i).compareTo(x) < 0) ++i;  // поиск элемента для переноса в старшую часть
            while (data.get(j).compareTo(x) > 0) --j;  // поиск элемента для переноса в младшую часть
            if (i <= j) {
                // обмен элементов местами:
                data.swap(i, j);
                // переход к следующим элементам:
                i++;
                j--;
            }
        } while (i < j);
        if (low < j) qSort(data, low, j);
        if (i < high) qSort(data, i, high);
    }
}
