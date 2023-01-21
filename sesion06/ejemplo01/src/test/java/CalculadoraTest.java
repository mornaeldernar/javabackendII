import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    public Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba del metodo suma")
    void sumaTest(){
        assertEquals(44,calculadora.suma(10,34));
    }
    @Test
    void restaTest(){
        assertEquals(0, calculadora.resta(4,4));
        assertEquals(6, calculadora.resta(10,4));
    }

    @Test
    void multiplicaTest(){
        assertEquals(6,calculadora.multiplicacion(3,2));
    }

    @Test
    void divideTest(){
        assertEquals(1, calculadora.division(5,5));
        Throwable exception = assertThrows(IllegalArgumentException.class,() -> calculadora.division(5,0));
        assertTrue(exception.getMessage().equals("No es posible dividir un valor entre 0"));
    }

}