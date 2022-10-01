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
        Recursoobj r1 = new Recursoobj(0, obj);
        colaTest.push(r1);
        assertEquals(1,colaTest.count());
    }
    @Test
    public void SacarUnElemento(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",1234);
        Recursoobj r1 = new Recursoobj(0, obj);
        colaTest.push(r1);
        colaTest.pop();
        assertEquals(0,colaTest.count());
    }
    @Test
    public void PrimerElementoCargoBien(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        Recursoobj r1=new Recursoobj(0, obj);
        colaTest.push(r1);
        assertEquals(r1,colaTest.first());
    }
    @Test
    public void AgregarMuchosElementos(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        obj obj1= new obj("juna",1);
        obj obj2= new obj("tomi",90);
        obj obj3= new obj("Uwu",123);

        Recursoobj r=new Recursoobj(obj);
        Recursoobj r1=new Recursoobj(3, obj1);
        Recursoobj r2=new Recursoobj(5, obj2);
        Recursoobj r3=new Recursoobj(2, obj3);
        colaTest.push(r);
        colaTest.push(r1);
        colaTest.push(r2);
        colaTest.push(r3);
        assertEquals(4,colaTest.count());
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
        colaTest.push(r);
        colaTest.push(r1);
        colaTest.push(r2);
        colaTest.push(r3);
        colaTest.pop();
        colaTest.pop();
        colaTest.pop();
        assertEquals(1,colaTest.count());
    }
    @Test
    public void AseguradoraDeSacarBien(){
        UCPQueue colaTest = new UCPQueue();
        obj obj= new obj("pepe",5);
        obj obj1= new obj("juna",1);
        obj obj2= new obj("tomi",90);
        obj obj3= new obj("Uwu",123);

        Recursoobj r=new Recursoobj(5, obj);
        Recursoobj r1=new Recursoobj(3, obj1);
        Recursoobj r2=new Recursoobj(5, obj2);
        Recursoobj r3=new Recursoobj(2, obj3);
        colaTest.push(r);
        colaTest.push(r1);
        colaTest.push(r2);
        colaTest.push(r3);
        colaTest.pop();
        assertEquals(r,colaTest.first());
    }
}