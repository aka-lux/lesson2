import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguresTest {
    Double epsilon = 0.01;

    @Test
    void triangle() {
        Assertions.assertEquals(52.3945,Figures.triangle(-11),epsilon);
        Assertions.assertEquals(0.0,Figures.triangle(0),epsilon);
        Assertions.assertEquals(0.433,Figures.triangle(1),epsilon);
        Assertions.assertEquals(270.6329,Figures.triangle(25),epsilon);
        Assertions.assertEquals(248793.51,Figures.triangle(758),epsilon);
    }

    @Test
    void circle() {
        Assertions.assertEquals(121,Figures.square(-11));
        Assertions.assertEquals(0,Figures.square(0));
        Assertions.assertEquals(1,Figures.square(1),1);
        Assertions.assertEquals(625,Figures.square(25));
        Assertions.assertEquals(574564,Figures.square(758));
    }
}