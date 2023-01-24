import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;

public class FeatureTest {
    @Test
    @DisabledOnOs(OS.LINUX)
    public void prueba1() {
        assertTrue(true);
    }
    @Test
    @EnabledOnOs(OS.LINUX)
    public void prueba2() {
        assertTrue(true);
    }
    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
    public void prueba3() {
        assertTrue(true);
    }


    @Test
    @DisabledOnJre(JAVA_17)
    public void prueba4() {
        assertTrue(true);
    }

    @Test
    @DisabledForJreRange(min = JAVA_8, max = JAVA_17)
    public void prueba5(){
        assertTrue(true);
    }

    @Test
    public void par(){
        assertFalse(5%2 == 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9})
    public void para(int n) {
        assertTrue(n%2 == 0);
    }

}
