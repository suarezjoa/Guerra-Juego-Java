package Akoo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

import org.junit.Test;

public class ArchivoTestCola {
    @Test
    public void DebecrearunaCola(){
        UCPQueue colaTest = new UCPQueue();
        assertNotNull(colaTest);
    }
    @Test
    public void AgregarUnElemento(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",1234);
        Recursoobj r1 = new Recursoobj(1, obj);
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        assertEquals(1,colaTest.count()); // Aca nos aseguramos de que haya 1 objetos en la cola.
    }
    @Test
    public void SacarUnElemento(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",1234);
        Recursoobj r1 = new Recursoobj(1, obj);
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        assertEquals(r1,colaTest.pop());  // Saca el obj "r1" que se encuentra en la 0 posicion de la cola pero con la prioridad mas alta.
        assertEquals(0,colaTest.count()); // Aca nos aseguramos de que no haya objetos en la cola.
    }
    @Test
    public void PrimerElementoCargoBien(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        Recursoobj r1=new Recursoobj(0, obj);
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        assertEquals(r1,colaTest.first(0)); // aseguramos de que se guarde en la posicion 0 de la cola
    }
    @Test
    public void AgregarMuchosElementos(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        obj obj1= new obj("juna",1);
        obj obj2= new obj("tomi",90);
        obj obj3= new obj("Uwu",123);

        Recursoobj r=new Recursoobj( obj);
        Recursoobj r1=new Recursoobj(3, obj1);
        Recursoobj r2=new Recursoobj(5, obj2);
        Recursoobj r3=new Recursoobj(2, obj3);
        colaTest.push(r); // agregamos a la cola el obj "r"
        assertEquals(r,colaTest.first(0)); // aseguramos de que se guarde en la posicion 0 de la cola
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        assertEquals(r1,colaTest.first(1)); // aseguramos de que se guarde en la posicion 1 de la cola
        colaTest.push(r2); // agregamos a la cola el obj "r2"
        assertEquals(r2, colaTest.first(2)); // aseguramos de que se guarde en la posicion 2 de la cola
        colaTest.push(r3); // agregamos a la cola el obj "r3"
        assertEquals(r3, colaTest.first(3)); // aseguramos de que se guarde en la posicion 3 de la cola
        assertEquals(4,colaTest.count()); // Aca nos aseguramos de que haya 4 objetos en la cola.
    } 
    @Test
    public void SacarMuchosElementos(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        obj obj1= new obj("juna",1);
        obj obj2= new obj("tomi",90);
        obj obj3= new obj("Uwu",123);

        Recursoobj r=new Recursoobj( obj);
        Recursoobj r1=new Recursoobj(3, obj1);
        Recursoobj r2=new Recursoobj(5, obj2);
        Recursoobj r3=new Recursoobj(2, obj3);
        colaTest.push(r); // agregamos a la cola el obj "r"
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        colaTest.push(r2); // agregamos a la cola el obj "r2"
        colaTest.push(r3); // agregamos a la cola el obj "r3"
        colaTest.pop(); // retornamos y removemos el objeto con mayor prioridad en la cola.
        colaTest.pop(); 
        colaTest.pop(); 
        colaTest.pop(); 
        assertEquals(0,colaTest.count()); // Aca nos aseguramos de que no haya objetos en la cola.
    }
    @Test
    public void AseguradoraDeSacarBien(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        obj obj1= new obj("juna",1);
        obj obj2= new obj("tomi",90);
        obj obj3= new obj("Uwu",123);

        Recursoobj r=new Recursoobj( obj);
        Recursoobj r1=new Recursoobj(3, obj1);
        Recursoobj r2=new Recursoobj(5, obj2);
        Recursoobj r3=new Recursoobj(2, obj3);
        colaTest.push(r); // agregamos a la cola el obj "r"
        assertEquals(r,colaTest.first(0)); // aseguramos de que se guarde en la posicion 0 de la cola
        colaTest.push(r1); // agregamos a la cola el obj "r1"
        assertEquals(r1,colaTest.first(1)); // aseguramos de que se guarde en la posicion 1 de la cola
        colaTest.push(r2);//agregamos a la cola el obj "r2"
        assertEquals(r2,colaTest.first(2)); // aseguramos de que se guarde en la posicion 2 de la cola
        colaTest.push(r3); //agregamos a la cola el obj "r3"
        assertEquals(r3,colaTest.first(3)); // aseguramos de que se guarde en la posicion 3 de la cola

        assertEquals(r3, colaTest.pop()); // Saca el obj "r3" que se encuentra en la 3 posicion de la cola pero con la prioridad mas alta,
        assertEquals(r1, colaTest.pop()); // Saca el obj "r1" que se encuentra en la 1 posicion de la cola con la segunda prioridad mas alta.
        assertEquals(r2, colaTest.pop()); // Saca el obj "r2" que se encuentra en la 2 posicion de la cola con la tercera prioridad mas alta.
        assertEquals(r, colaTest.pop()); // Saca el obj "r" que se encuentra en la 0 posicion de la cola sin ningun tipo de prioridad.
    }
}
