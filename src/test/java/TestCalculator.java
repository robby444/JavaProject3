import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculator {
    @Test
    public void testSubtractionExceptionMessage() {
        try {
            Calculator.subtract(5, 10);
        } catch (InvalidInputException e) {
            assertEquals("Number 1 should be greater than Number 2", e.getMessage());
        }
    }

    @Test
    public void testSubtractionThrowsInvalidInputException() {
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            Calculator.subtract(5, 10);
        });
    }

}
