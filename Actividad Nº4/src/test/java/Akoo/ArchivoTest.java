package Akoo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.time.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ArchivoTest {
    @Test
    public void debeCrearSoldado() {
        Soldado soldado = new Soldado("Soldado", 1, 1);
        assertEquals("Soldado", soldado.getNombre());
        assertEquals(1, soldado.getVida(), 0.0);
        assertEquals(1, soldado.getAtaque());

    }

    @Test
    public void debeCrearTanque() {
        Tanque tanque = new Tanque("Tanque", 2, 1);
        assertEquals("Tanque", tanque.getNombre());
        assertEquals(2, tanque.getVida(), 0.0);
        assertEquals(1, tanque.getAtaque());

    }

    @Test
    public void debeCrearBuque() {
        Buque buque = new Buque("Buque", 3, 1);
        assertEquals("Buque", buque.getNombre());
        assertEquals(3, buque.getVida(), 0.0);
        assertEquals(1, buque.getAtaque());

    }

    @Test
    public void SoldadoAtacaSoldadoCuchillo() {
        Cuchillo cuchillo = new Cuchillo("Chuchillo", 0.2f, "Soldado", 1, 1, 3);
        Soldado soldado1 = new Soldado("Soldado1", 1, 1);
        Soldado soldado2 = new Soldado("Soldado2", 1, 1);
        Escudo escudo = new Escudo(0.5f);
        soldado1.atacarSoldado(soldado2, escudo, cuchillo);
        assertEquals(0.3, Math.round(soldado2.getVida() * 100.0) / 100.0, 0.0);
    }

    @Test
    public void SoldadoAtacaSoldadoAmetralladora() {
        Ametralladora ametralladora = new Ametralladora("Ametralladora", 0.7f, "Soldado", 1, 1, 3);
        Soldado soldado1 = new Soldado("Soldado1", 1, 1);
        Soldado soldado2 = new Soldado("Soldado2", 1, 1);
        Escudo escudo = new Escudo(0.5f);
        soldado1.atacarSoldado(soldado2, escudo, ametralladora);
        assertEquals(0.0, soldado2.getVida(), 0.0);
    }

    @Test
    public void SoldadoAtacaTanque() {
        Soldado soldado1 = new Soldado("Soldado1", 1, 1);
        Tanque tanque2 = new Tanque("Tanque2", 2, 1);
        soldado1.atacar(tanque2, new Escudo(0.5f));
        assertEquals(2, tanque2.getVida(), 0.0);
    }

    @Test
    public void SoldadoAtacaBuque() {
        Soldado soldado1 = new Soldado("Soldado1", 1, 1);
        Buque buque2 = new Buque("Buque2", 3, 1);
        soldado1.atacar(buque2, new Escudo(0.5f));
        assertEquals(3.5, buque2.getVida(), 0.0);
    }

    @Test
    public void TanqueAtacaSoldado() {
        Tanque tanque1 = new Tanque("Tanque1", 2, 1);
        Soldado soldado2 = new Soldado("Soldado2", 1, 1);
        tanque1.atacar(soldado2, new Escudo(0.5f));
        assertEquals(0.5, soldado2.getVida(), 0.0);
    }

    @Test
    public void TanqueAtacaTanque() {
        Tanque tanque1 = new Tanque("Tanque1", 2, 1);
        Tanque tanque2 = new Tanque("Tanque2", 2, 1);
        tanque1.atacar(tanque2, new Escudo(0.5f));
        assertEquals(2, tanque2.getVida(), 0.0);
    }

    @Test
    public void TanqueAtacaBuque() {
        Tanque tanque1 = new Tanque("Tanque1", 2, 1);
        Buque buque2 = new Buque("Buque2", 3, 1);
        Escudo escudo = new Escudo(0.5f);
        tanque1.atacar(buque2, escudo);
        assertEquals(3.5, buque2.getVida(), buque2.getVida());
    }

    @Test
    public void BuqueAtacaSoldado() {
        Buque buque1 = new Buque("Buque1", 3, 1);
        Soldado soldado2 = new Soldado("Soldado2", 1, 1);
        buque1.atacar(soldado2, new Escudo(0.5f));
        assertEquals(0.5, soldado2.getVida(), 0.0);
    }

    @Test
    public void BuqueAtacaTanque() {
        Buque buque1 = new Buque("Buque1", 3, 1);
        Tanque tanque2 = new Tanque("Tanque2", 2, 1);
        buque1.atacar(tanque2, new Escudo(0.5f));
        assertEquals(2, tanque2.getVida(), 0.0);
    }

    @Test
    public void BuqueAtacaBuque() {
        Buque buque1 = new Buque("Buque1", 3, 1);
        Buque buque2 = new Buque("Buque2", 3, 1);
        buque1.atacar(buque2, new Escudo(0.5f));
        assertEquals(3.5, buque2.getVida(), 0.0);
    }

    @Test
    public void debeImprimirSoldado() {

        Soldado soldado = new Soldado("Soldado", 1, 1);
        assertEquals("[Soldado] Soldado, Vida: 1.0, Ataque: 1", soldado.imprimir());

    }

    @Test
    public void debeImprimirTanque() {

        Tanque tanque = new Tanque("Tanque", 2, 1);
        assertEquals(
                "[Tanque] [Vehiculo] Tanque, Vida: 2.0, Ataque: 1[Conductor][Soldado] Conductor, Vida: 100.0, Ataque: 10",
                tanque.imprimir());

    }

    @Test
    public void debeImprimirBuque() {
        Buque buque = new Buque("Buque", 3, 1);
        assertEquals(
                "[Buque] [Vehiculo] Buque, Vida: 3.0, Ataque: 1[Conductor][Soldado] Conductor, Vida: 100.0, Ataque: 10",
                buque.imprimir());

    }

    @Test
    public void debeImprimirEscudo() {
        Escudo escudo = new Escudo(0.5f);
        assertEquals("[Escudo] Cantidad: 0.5", escudo.imprimir());
    }

    @Test
    public void debeVerificarSoldadoVivo() {
        Soldado soldado = new Soldado("Soldado", 1, 1);
        assertTrue(soldado.estaVivoSoldado());
    }

    @Test
    public void debeVerificarSoldadoMuerto() {
        Soldado soldado = new Soldado("Soldado", 0, 1);
        assertFalse(soldado.estaVivoSoldado());
    }

    @Test
    public void debeVerificarTanqueVivo() {
        Tanque tanque = new Tanque("Tanque", 2, 1);
        assertTrue(tanque.estaVivo());
    }

    @Test
    public void debeVerificarTanqueMuerto() {
        Tanque tanque = new Tanque("Tanque", 0, 1);
        assertFalse(tanque.estaVivo());
    }

    @Test
    public void debeVerificarBuqueVivo() {
        Buque buque = new Buque("Buque", 3, 1);
        assertTrue(buque.estaVivo());
    }

    @Test
    public void debeVerificarBuqueMuerto() {
        Buque buque = new Buque("Buque", 0, 1);
        assertFalse(buque.estaVivo());
    }

    @Test
    public void debeIngresarRecursoSoldado() {
        Soldado s1 = new Soldado("Soldado", 0, 1);
        LocalDate lt = LocalDate.now();
        RecursoMuseo rm = new RecursoMuseo(lt, s1);
        Museo m = new Museo();
        m.agregarRecurso(rm);

        m.imprimirRecurso();

        assertEquals(1, m.getRecursos().size());
        assertEquals("Museo [RecursoMuseo] Fecha de muerte: " + lt + " Nombre: Soldado", m.imprimir());

    }

    @Test
    public void debeIngresarRecursoTanque() {
        Tanque t1 = new Tanque("Tanque", 0, 1);
        LocalDate lt = LocalDate.now();
        RecursoMuseo rm = new RecursoMuseo(lt, t1);
        Museo m = new Museo();
        m.agregarRecurso(rm);

        m.imprimirRecurso();

        assertEquals(1, m.getRecursos().size());
        assertEquals("Museo [RecursoMuseo] Fecha de muerte: " + lt + " Nombre: Tanque", m.imprimir());
    }

    @Test
    public void debeIngresarRecursoBuque() {
        Buque b1 = new Buque("Buque", 0, 1);
        LocalDate lt = LocalDate.now();
        RecursoMuseo rm = new RecursoMuseo(lt, b1);
        Museo m = new Museo();
        m.agregarRecurso(rm);

        m.imprimirRecurso();

        assertEquals(1, m.getRecursos().size());
        assertEquals("Museo [RecursoMuseo] Fecha de muerte: " + lt + " Nombre: Buque", m.imprimir());
    }

    @Test
    public void debeCrearSuperTest() {
        LocalDate lt = LocalDate.now();
        Museo m = new Museo();
        Escudo escudo = new Escudo(0.5f);
        Soldado IronMan = new Soldado("Pepe ", 1000, 1000);

        for (int i = 0; i < 300; i++) {
            Soldado soldado = new Soldado("Soldado " + i, 10, 1);
            Tanque tanque = new Tanque("Tanque " + i, 10, 1);
            Buque buque = new Buque("Buque " + i, 10, 1);
            IronMan.atacar(soldado, escudo);
            IronMan.atacar(tanque, escudo);
            IronMan.atacar(buque, escudo);

            RecursoMuseo rmSoldado = new RecursoMuseo(lt, soldado);
            RecursoMuseo rmTanque = new RecursoMuseo(lt, tanque);
            RecursoMuseo rmBuque = new RecursoMuseo(lt, buque);

            m.agregarRecurso(rmSoldado);
            m.agregarRecurso(rmTanque);
            m.agregarRecurso(rmBuque);

        }
    }

    @Test
    public void imprimirsolosoldadocon00(){
        ArrayList<Soldado> Soldados= new ArrayList<Soldado>();
        for (int i = 0; i < 10000; i++) {
            Soldado soldado = new Soldado("Pepe"+i, 10, 1);
            Soldados.add(soldado);
        }
        final Predicate<Soldado> termina00 = s -> s.getNombre().endsWith("00");
        Soldados.stream().filter(termina00).forEach(s -> System.out.println(s.getNombre()));
    }
    @Test
    public void nuemosPares(){
        ArrayList<Soldado> Soldados= new ArrayList<Soldado>();
        for (int i = 0; i < 10000; i++) {
            Soldado soldado = new Soldado("Pepe"+i, 10, 1);
            Soldados.add(soldado);
        }
        Predicate<Soldado> numerospares =  s -> !(s.getNombre().contains( "1") || s.getNombre().contains( "3") || s.getNombre().contains( "5") || s.getNombre().contains( "7") || s.getNombre().contains( "9"));
        Soldados.stream().filter(numerospares).forEach(s -> System.out.println(s.getNombre()));
    }
    @Test
    public void logitudImpar() {
    ArrayList<Soldado> soldado = new ArrayList<Soldado>();

    for (int i = 0; i < 10000; i++) {
        soldado.add(new Soldado("Soldado " + i, 10, 1));
    }

    Predicate<Soldado> LongitudImpar = s -> s.getNombre().length() % 2 != 0;

    soldado.stream().filter(LongitudImpar).forEach(s -> System.out.println(s.getNombre()));

    assertEquals(910, soldado.stream().filter(LongitudImpar).count());

    }
    
    @Test

    public void superTestRequisitos() {

        ArrayList<Soldado> soldado = new ArrayList<Soldado>();

        for (int i = 0; i < 10000; i++) {
            soldado.add(new Soldado("Soldado " + i, 10, 1));
        }

        Predicate<Soldado> LongitudImpar = s -> s.getNombre().length() % 2 != 0;

        Predicate<Soldado> DigitosIguales = s -> s.getNombre().charAt(s.getNombre().length() - 1) == s.getNombre()
                .charAt(s.getNombre().length() - 2)
                && s.getNombre().charAt(s.getNombre().length() - 1) == s.getNombre().charAt(s.getNombre().length() - 3);

        Predicate<Soldado> Termina00 = s -> s.getNombre().endsWith("00");

        Predicate<Soldado> DigitosPares = s -> s.getNombre().charAt(s.getNombre().length() - 1) % 2 == 0
                && s.getNombre().charAt(s.getNombre().length() - 2) % 2 == 0
                && s.getNombre().charAt(s.getNombre().length() - 3) % 2 == 0
                && s.getNombre().charAt(s.getNombre().length() - 4) % 2 == 0;

        Predicate<Soldado> Requisitos = (LongitudImpar.and(DigitosIguales)).or(Termina00.and(DigitosPares));

        soldado.stream().filter(Requisitos).forEach(s -> System.out.println(s.getNombre()));

        assertEquals(33, soldado.stream().filter(Requisitos).count());
        assertEquals("Soldado 111", soldado.stream().filter(Requisitos).findFirst().get().getNombre());
    }
}


