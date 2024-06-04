import org.example.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BasicCalculatorTest {

    @Test
    public void checkPlus() {
        BasicCalculator basicCalculator = new BasicCalculator();
        Double result = basicCalculator.calculate('+', 5.0, 6.0);
        assertEquals(result, 11.0);
    }
}
