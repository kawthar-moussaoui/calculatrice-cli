package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AddOperationTest {
    @Test
    void addsPositiveNumbers() {
        assertEquals(5.0, new AddOperation().execute(2.0, 3.0), 0.000001);
    }

    @Test
    void addsNegativeAndDecimalNumbers() {
        assertEquals(-1.5, new AddOperation().execute(-2.0, 0.5), 0.000001);
    }
}
