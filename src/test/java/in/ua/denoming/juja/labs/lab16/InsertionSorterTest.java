package in.ua.denoming.juja.labs.lab16;

import in.ua.denoming.juja.shared.SorterTest;

import in.ua.denoming.juja.shared.Array;
import in.ua.denoming.juja.shared.Sorter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSorterTest {
    private Array<Integer> data;
    private Sorter sorterMethod;

    @BeforeEach
    void setUp() {
        data = SorterTest.getDataForTesting();
        sorterMethod = new InsertionSorter();
    }

    @Test
    void test() {
        System.out.println(SorterTest.testSortMethod(sorterMethod, data));
    }

    @Test
    void testEmptyArray() {
        Array<Integer> emptyData = SorterTest.getEmptyDataForTesting();
        System.out.println(SorterTest.testSortMethod(sorterMethod, emptyData));
    }
}
