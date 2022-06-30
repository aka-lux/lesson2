import hwLesson1.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(p1,Printer.printer(1));
        Assertions.assertEquals(p2,Printer.printer(2));
        Assertions.assertEquals(p3, Printer.printer(3));
    }
}