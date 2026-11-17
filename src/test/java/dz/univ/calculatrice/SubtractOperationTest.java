package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
<<<<<<< HEAD

import org.junit.jupiter.api.Test;

class SubtractOperationTest {

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(2.0, operation.apply(5.0, 3.0));
    }

    @Test
    void shouldSubtractNegativeNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(1.0, operation.apply(-2.0, -3.0));
    }

    @Test
    void shouldSubtractDecimalNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(0.5, operation.apply(2.5, 2.0), 0.0001);
    }
}
=======
import org.junit.jupiter.api.Test;

class SubtractOperationTest {
    @Test
    void subtractsPositiveNumbers() {
        assertEquals(2.0, new SubtractOperation().execute(5.0, 3.0), 0.000001);
    }

    @Test
    void subtractsNegativeAndDecimalNumbers() {
        assertEquals(-2.5, new SubtractOperation().execute(-2.0, 0.5), 0.000001);
    }
}
>>>>>>> upstream/main
