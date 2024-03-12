import org.junit.Test;
import static org.junit.Assert.*;

public class PortaTest {

    @Test
    public void testPortaComEntradasTrue() {
        Porta porta = new Porta(true, true);
        assertTrue(porta.getSaida());
    }

    @Test
    public void testPortaComEntradaFalse() {
        Porta porta = new Porta(true, false);
        assertFalse(porta.getSaida());
    }

    @Test
    public void testPortaComEntradasZeroEUm() {
        Porta porta = new Porta(0, 1);
        assertTrue(porta.getSaida());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPortaComEntradasInvalidas() {
        Porta porta = new Porta(2, -1);
    }
}
