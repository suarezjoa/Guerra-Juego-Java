package Akoo;

public class Soldado extends Ejercito {
    

    

    public Soldado(String nombre, float vida, int ataque) {
        super(nombre, vida, ataque);
        
        

    }

public void atacarSoldado(Soldado soldado2, Escudo escudo, ArmaBase arma){
    soldado2.setVida((soldado2.getVida()+(soldado2.getVida()*escudo.getCantidad())) - (this.getAtaque()+(this.getAtaque()* arma.getDanio())));
}

    



    public boolean estaVivoSoldado() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String imprimir() {
        return "[Soldado] " + super.imprimir();
    }

}
