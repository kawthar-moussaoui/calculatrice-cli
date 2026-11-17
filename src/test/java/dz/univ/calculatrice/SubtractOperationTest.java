package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

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