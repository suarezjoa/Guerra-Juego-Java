package Akoo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;
import javax.naming.LinkRef;


public class UCPQueue {
    //FIFO
    ArrayList<Recursoobj> cola= new ArrayList<Recursoobj>();


    public void push(Recursoobj r1){ 
        cola.add(r1);
    }
    public Recursoobj pop(){
        Predicate<Recursoobj> prioridadte = (Recursoobj s) -> ((Recursoobj) s).getPrio() >= 1;

        Recursoobj aux=new Recursoobj(900000,null);
        ArrayList<Recursoobj> aux2= new ArrayList<Recursoobj>();
        if(cola.stream().anyMatch(prioridadte)){
            for (Object nico : cola) {
                if(((Recursoobj) nico).getPrio() >= 1){
                    aux2.add((Recursoobj) nico);
                }
            }
            for (Recursoobj nico : aux2) {
                if(((Recursoobj) nico).getPrio() < aux.getPrio()){
                    aux=(Recursoobj) nico;
                }
            }
            for (Recursoobj nico : cola) {
                if(((Recursoobj) nico).getPrio() == aux.getPrio()){
                    cola.remove(nico);
                    return nico;
                }
            }
        }
        else{
            return cola.remove(0);
        }
        return null;
    }
    public Object first(int n){ 
        return cola.get(n);
    }
    public int count(){ 
        return cola.size();
    }

}