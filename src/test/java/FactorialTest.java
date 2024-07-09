import static org.junit.jupiter.api.Assertions.*;

import Lesson_7_junit_5.Factorial;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, Factorial.calculate(10));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
    }
}