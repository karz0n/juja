package in.ua.denoming.juja.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 11:00
 */
class ElementTest {
    private Element<Integer> element;

    private static final int DEFAULT_ID = 0;
    private static final Integer DEFAULT_VALUE = 0;

    @BeforeEach
    void setUp() {
        element = new Element<>(DEFAULT_ID, DEFAULT_VALUE);
    }

    @Test
    void testInit() {
        assertEquals(element.getIndex(), DEFAULT_ID);
        assertEquals(element.getValue(), DEFAULT_VALUE);
    }

    @Test
    void testSetValue() {
        final Integer VALUE = new Random().nextInt(100);
        element.setValue(VALUE);
        assertEquals(element.getValue(), VALUE);
    }

    @Test
    void testToString() {
        Scanner scanner = new Scanner(element.toString());
        Pattern pattern = Pattern.compile("\\[\\d+=\\d+\\]");
        assertTrue(scanner.hasNext(pattern));
    }

    @Test
    void testEquals() {
        Element<Integer> newElement = new Element<>(DEFAULT_ID, DEFAULT_VALUE);
        assertEquals(element, newElement);
    }
}