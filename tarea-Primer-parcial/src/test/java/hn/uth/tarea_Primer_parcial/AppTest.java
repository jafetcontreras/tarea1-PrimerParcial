package hn.uth.tarea_Primer_parcial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    AreaCalculator calculator = new AreaCalculator();

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(12.566370614359172, calculator.calcularAreaCirculo(2), 0.001);
        assertEquals(50.26548245743669, calculator.calcularAreaCirculo(4.5), 0.001);
        assertEquals(78.53981633974483, calculator.calcularAreaCirculo(5), 0.001); 
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16.0, calculator.calcularAreaCuadrado(4), 0.001);
        assertEquals(81.0, calculator.calcularAreaCuadrado(9), 0.001);
        assertEquals(100.0, calculator.calcularAreaCuadrado(10), 0.001); 
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(12.0, calculator.calcularAreaRectangulo(3, 4), 0.001);
        assertEquals(56.25, calculator.calcularAreaRectangulo(7.5, 7.5), 0.001);
        assertEquals(20.0, calculator.calcularAreaRectangulo(4, 5), 0.001); 
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(6.0, calculator.calcularAreaTriangulo(3, 4), 0.001);
        assertEquals(16.875, calculator.calcularAreaTriangulo(7.5, 4.5), 0.001);
        assertEquals(12.0, calculator.calcularAreaTriangulo(6, 4), 0.001); 
    }
}