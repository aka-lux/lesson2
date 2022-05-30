import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    private static final String p1 =
            "---\n" +
            "|*|\n" +
            "---\n";
    private static final String p2 =
            "----\n" +
            "|**|\n" +
            "|**|\n" +
            "----\n";
    private static final String p3 =
            "-----\n" +
            "|***|\n" +
            "|***|\n" +
            "|***|\n" +
            "-----\n";

    @Test
    void printer() {
        Assertions.assertEquals(Printer.printer(1),p1);
        Assertions.assertEquals(Printer.printer(2),p2);
        Assertions.assertEquals(Printer.printer(3),p3);
    }
}