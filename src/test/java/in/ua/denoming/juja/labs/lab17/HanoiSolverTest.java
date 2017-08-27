package in.ua.denoming.juja.labs.lab17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HanoiSolverTest {
    private Stack<Integer> from;
    private Stack<Integer> help;
    private Stack<Integer> to;

    @BeforeEach
    void setUp() {
        from = new Stack<>();
        from.push(3);
        from.push(2);
        from.push(1);

        this.help = new Stack<>();
        this.to = new Stack<>();
    }

    @Test
    void test() {
        int size = from.size();
        HanoiSolver.exchange(from, help, to, size);
        assertTrue(from.empty());
        assertTrue(help.empty());
        assertTrue(to.size() == size);
    }
}
