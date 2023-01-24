import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();
    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void os1(){
        var result = c.add(1,2);
        assertEquals(3,result);
    }
    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void os2(){
        var result = c.add(1,2);
        assertEquals(3,result);
    }
    @Test
    @EnabledOnJre(JRE.JAVA_18)
    @EnabledIfEnvironmentVariable(named="ENV",matches="stagin-server")
    public void j1() {
        var result = c.add(1,2);
        assertEquals(3,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    public void add(int n) {
        var result = c.add(n,1);
        assertEquals(n+1,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    public void mult(int n) {
        var result = c.multiply(n,2);
        assertEquals(n*2,result);
    }
    @Test
    @DisplayName("Prueba con nombre distinto")
    public void mult2() {
        var result = c.add(2,2);
        assertEquals(2+2,result);
    }

}