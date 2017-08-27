package in.ua.denoming.juja.labs.lab20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;

class PermutatorTest {
    @Test
    void test() {
        int[] values = {10, 20, 30};
        Collection<String> options = new LinkedList<>();
        Permutator.permutation(values, options);

        assertEquals(6, options.size());
    }
}
