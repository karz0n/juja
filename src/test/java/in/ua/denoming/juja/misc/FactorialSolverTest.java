package in.ua.denoming.juja.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialSolverTest {
    @Test
    void testValue() {
        assertEquals(1, FactorialSolver.calc(0));
        assertEquals(1,FactorialSolver.calc(1));
        assertEquals(1,FactorialSolver.calc(2));
        assertEquals(377,FactorialSolver.calc(14));
    }
}
