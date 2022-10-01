package Akoo;
public class Buque extends Vehiculo {
    

    public Buque(String nombre, float vida, int ataque) {
        super(nombre, vida, ataque);
        

    }
   
    public float getVidaBuque() {
        return vida;
    }
    public void setVidaBuque(float vida) {
        this.vida = vida;
    }
    public int getAtaqueBuque() {
        return ataque;
    }
    public void setAtaqueBuque(int ataque) {
        this.ataque = ataque;
    }
    

    public boolean estaVivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String imprimir() {
        return "[Buque] " + super.imprimir();
    }
    
}
