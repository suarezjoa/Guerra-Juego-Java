import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArchivoTest {
    @Test
    public void crearSoldado() {
        Soldado s1 = new Soldado("Ejercito 1", 1, 1, "Juan");

        assertEquals("Ejercito 1", s1.getNombre());
        assertEquals(1, s1.getVida());
        assertEquals(1, s1.getAtaque());
        assertEquals("Juan", s1.getNombreSoldado());
    }

    @Test
    public void atacarSoldado() {
        Soldado s1 = new Soldado("Ejercito 1", 1, 1, "Juan");
        Soldado s2 = new Soldado("Ejercito 2", 1, 1, "Pablo");
        s1.atacarSoldado(s1, s2);
        assertEquals(0, s2.getVida());
    }

    @Test
    public void estaVivoSoldado() {
        Soldado s1 = new Soldado("Ejercito 1", 1, 1, "Juan");
        assertTrue(s1.estaVivoSoldado());
    }

    @Test
    public void crearTanque() {
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        assertEquals("Ejercito 1", t1.getNombre());
        assertEquals(2, t1.getVida());
        assertEquals(1, t1.getAtaque());
        assertEquals("Panzer 1", t1.getNombreTanque());

    }

    @Test
    public void atacarTanque() {
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        Tanque t2 = new Tanque("Ejercito 2", 2, 1, "Panzer 2");
        t1.atacar(t1, t2);
        assertEquals(1, t2.getVida());
    }

    @Test
    public void estaVivoTanque() {
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        assertTrue(t1.estaVivo());
    }

    @Test
    public void crearBuque() {
        Buque b1 = new Buque("Ejercito 1", 3, 1, "Buque 1");
        assertEquals("Ejercito 1", b1.getNombre());
        assertEquals(3, b1.getVida());
        assertEquals(1, b1.getAtaque());
        assertEquals("Buque 1", b1.getNombreBuque());

    }

    @Test
    public void atacarBuque() {
        Buque b1 = new Buque("Ejercito 1", 3, 1, "Buque 1");
        Buque b2 = new Buque("Ejercito 2", 3, 1, "Buque 2");
        b1.atacar(b1, b2);
        assertEquals(2, b2.getVida());

    }

    @Test
    public void estaVivoBuque() {
        Buque b1 = new Buque("Ejercito 1", 3, 1, "Buque 1");
        assertTrue(b1.estaVivo());
    }

    @Test
    public void ataqueTB() {
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        Buque b1 = new Buque("Ejercito 2", 3, 1, "Buque 1");
        t1.atacarTB(t1, b1);
        assertEquals(2, b1.getVida());

    }

    @Test
    public void ataqueBS() {
        Buque b1 = new Buque("Ejercito 1", 3, 1, "Buque 1");
        Soldado s1 = new Soldado("Ejercito 2", 1, 1, "Pablo");
        b1.atacarBS(b1, s1);
        assertEquals(0, s1.getVida());

    }

    @Test
    public void ataqueTS() {
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        Soldado s1 = new Soldado("Ejercito 2", 1, 1, "Pablo");
        t1.atacarTS(t1, s1);
        assertEquals(0, s1.getVida());
    }

    @Test 
    public void EscudoSoldado(){
        Soldado s1 = new Soldado("Ejercito 1", 1, 1, "Juan");
        Escudo e1 = new Escudo(0.50f);
        s1.escudoSoldado(e1, s1);
        assertEquals(1.50f, s1.getVida());
    }

    @Test
    public void EscudoTanque(){
        Tanque t1 = new Tanque("Ejercito 1", 2, 1, "Panzer 1");
        Escudo e1 = new Escudo(0.50f);
        t1.escudoTanque(e1, t1);
        assertEquals(3f, t1.getVida());
    }

    @Test
    public void EscudoBuque(){
        Buque b1 = new Buque("Ejercito 1", 3, 1, "Buque 1");
        Escudo e1 = new Escudo(0.50f);
        b1.escudoBuque(e1, b1);
        assertEquals(4.50f, b1.getVida());
    }


    

}
