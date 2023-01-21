import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDivideTest {
    static Calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba divide")
    void restaTest() {
        int esperado = 3;
        assertEquals(esperado, calculadora.division(6,2));
    }

}