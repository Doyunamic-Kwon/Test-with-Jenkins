package gcukakao.jenkins.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3)); // 2 + 3 = 5 인지 테스트 [cite: 60]
    }

    @Test
    public void testSub() {
        assertEquals(-3, calculator.sub(3, 6)); // 3 - 6 = -3 인지 테스트 [cite: 64, 66]
    }

    @Test
    public void testMul() {
        assertEquals(10, calculator.mul(2, 5)); // 2 * 5 = 10 인지 테스트 [cite: 68]
    }

    @Test
    public void testDiv() {
        assertEquals(6, calculator.div(12, 2)); // 12 / 2 = 6 인지 테스트 [cite: 72]
    }
}