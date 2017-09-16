package in.ua.denoming.juja.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSolverTest {
    @Test
    void testValues() {
        assertEquals(0, FibonacciSolver.calc(0));
        assertEquals(1, FibonacciSolver.calc(1));
        // ...
        assertEquals(34, FibonacciSolver.calc(9));
        assertEquals(55, FibonacciSolver.calc(10));
    }
}
