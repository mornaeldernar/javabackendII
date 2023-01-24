import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    Registro registro = new Registro();

    /**
     * La entrada no es valida si :
     * X El username o password son vacios
     * X El username contiene el caracter #
     * X Las contraseñas no coinciden
     * X La contraseña tiene una longitud menor a 8
     */
    @Test
    public void username1(){
        boolean result = registro.valida("","1234","12341234");
        assertFalse(result);
    }
    @Test
    public void password1(){
        boolean result = registro.valida("123","","12341234");
        assertFalse(result);
    }
    @Test
    public void username2(){
        boolean result = registro.valida("123#","1234","12341234");
        assertFalse(result);
    }
    @Test
    public void password2(){
        boolean result = registro.valida("asdf","1234","12341234");
        assertFalse(result);
    }
    @Test
    public void password3(){
        boolean result = registro.valida("asdf","1234","1234");
        assertFalse(result);
    }

    @Test
    public void general1() {
        boolean result = registro.valida("ASD#","","!234");
        assertFalse(result);
    }
    @Test
    public void general2(){
        boolean result = registro.valida("Rafa","12345678","12345678");
        assertTrue(result);
    }
}