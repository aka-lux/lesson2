import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguresTest {
    Double epsilon = 0.01;

    @Test
    void triangle() {
        Assertions.assertEquals(Figures.triangle(-11),52.3945,epsilon);
        Assertions.assertEquals(Figures.triangle(0),0.0,epsilon);
        Assertions.assertEquals(Figures.triangle(1),0.433,epsilon);
        Assertions.assertEquals(Figures.triangle(25),270.6329,epsilon);
        Assertions.assertEquals(Figures.triangle(758),248793.51,epsilon);
    }

    @Test
    void circle() {
        Assertions.assertEquals(Figures.square(-11),121);
        Assertions.assertEquals(Figures.square(0),0);
        Assertions.assertEquals(Figures.square(1),1);
        Assertions.assertEquals(Figures.square(25),625);
        Assertions.assertEquals(Figures.square(758),574564);
    }
}