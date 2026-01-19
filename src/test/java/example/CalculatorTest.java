package example;


import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Calculator Tests")
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition Test : Should add two numbers")
    void shouldAddNumbers(){
        int result = calculator.add(5, 3);
        assertEquals(8, result , "3 + 5 should equal 8");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(
            {
                    "0, 1, 1",
                    "1, 2, 3",
                    "10, -5, 5",
                    "-1, -1, -2"
            }
    )
    @DisplayName("Parameterized addition tests")
    void parameterizedAdditionTest(int a, int b, int expectedResult){
        int result = calculator.add(a, b);
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Division Test : Should not divide by Zero")
    void shouldNotDivideByZero(){
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(5, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }


}
