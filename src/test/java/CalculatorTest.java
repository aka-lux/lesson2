import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculator() {
        Assertions.assertEquals(2, Calculator.сalculator(1,'+',1));
        Assertions.assertEquals(41,Calculator.сalculator(45,'+',-4));

        Assertions.assertEquals(-50,Calculator.сalculator(76,'-',126));
        Assertions.assertEquals(-209,Calculator.сalculator(7,'-',216));

        Assertions.assertEquals(3388,Calculator.сalculator(44,'*',77));
        Assertions.assertEquals(242,Calculator.сalculator(11,'*',22));

        Assertions.assertEquals(0,Calculator.сalculator(500,'/',0));
        Assertions.assertEquals(10,Calculator.сalculator(400,'/',40));
    }
}