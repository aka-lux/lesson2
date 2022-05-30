import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void сalculator() {
        Assertions.assertEquals(Calculator.сalculator(1,'+',1),2);
        Assertions.assertEquals(Calculator.сalculator(45,'+',-4),41);

        Assertions.assertEquals(Calculator.сalculator(76,'-',126),-50);
        Assertions.assertEquals(Calculator.сalculator(7,'-',216),-209);

        Assertions.assertEquals(Calculator.сalculator(44,'*',77),3388);
        Assertions.assertEquals(Calculator.сalculator(11,'*',22),242);

        Assertions.assertEquals(Calculator.сalculator(500,'/',0),0);
        Assertions.assertEquals(Calculator.сalculator(400,'/',40),10);
    }
}