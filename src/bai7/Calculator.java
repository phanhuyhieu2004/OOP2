package bai7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand , int secondOperand, char operator) {
//        Biến a: firstOperand - toán hạng đầu tiên
//        Biến b: secondOperand - toán hạng thứ hai
//        Biến o: operator - toán tử

        switch (operator) {
            case '+':
                return firstOperand+ secondOperand;
            case '-':
                return firstOperand- secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand!= 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Không thể chia hết cho 0");
            default:
                throw new RuntimeException("lỗi");
        }
    }
}

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand  = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand ,operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand  = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
       int firstOperand = 6;
        int secondOperand  = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand  = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand , operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand  = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand , operator);});
    }
}
