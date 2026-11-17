package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddOperationTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(15.5, operation.apply(12.5, 3.0));
    }

    @Test
    void shouldAddNegativeNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(-5.0, operation.apply(-2.0, -3.0));
    }

    @Test
    void shouldAddDecimalNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(4.7, operation.apply(2.3, 2.4), 0.0001);
    }
}