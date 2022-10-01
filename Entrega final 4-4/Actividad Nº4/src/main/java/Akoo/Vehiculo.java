package Akoo;

public abstract class Vehiculo extends Ejercito {

    public Vehiculo(String nombre, float vida, int ataque) {
        super(nombre, vida, ataque);
    }
    

    @Override
    public String imprimir() {

        Soldado conductor = new Soldado("Conductor", 100, 10);
        return "[Vehiculo] " + super.imprimir() + "[Conductor]" + conductor.imprimir();
    }

}
