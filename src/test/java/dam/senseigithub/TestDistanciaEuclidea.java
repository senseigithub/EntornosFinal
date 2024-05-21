package dam.senseigithub;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDistanciaEuclidea {
    //Aqui va el test
    static DistanciaEuclidea distanciaEuclidea;

    @BeforeAll
    public static void setDistanciaEuclidea() {
        distanciaEuclidea = new DistanciaEuclidea();
    }

    @Test
    @DisplayName("DistanciaEuclidea")
    void testDistanciaEuclidea() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);
        assertEquals(5.0, distanciaEuclidea.medir(p1, p2));

        Punto p3 = new Punto(0, 0);
        Punto p4 = new Punto(10, 20);
        assertEquals(Math.sqrt(100 + 400), distanciaEuclidea.medir(p3, p4));

        Punto p5 = new Punto(0, 0);
        Punto p6 = new Punto(50, 60);
        assertEquals(Math.sqrt(2500 + 3600), distanciaEuclidea.medir(p5, p6));
    }
}