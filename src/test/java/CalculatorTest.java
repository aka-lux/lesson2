import hwLesson1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void calculator() {
        Assertions.assertEquals(2, Calculator.calculator(1,'+',1));
        Assertions.assertEquals(41, Calculator.calculator(45,'+',-4));

        Assertions.assertEquals(-50,Calculator.calculator(76,'-',126));
        Assertions.assertEquals(-209,Calculator.calculator(7,'-',216));

        Assertions.assertEquals(3388,Calculator.calculator(44,'*',77));
        Assertions.assertEquals(242,Calculator.calculator(11,'*',22));

        Assertions.assertEquals(0,Calculator.calculator(500,'/',0));
        Assertions.assertEquals(10,Calculator.calculator(400,'/',40));
    }
}