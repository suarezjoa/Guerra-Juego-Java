package Akoo;

public class Tanque extends Vehiculo {
    
    

    public Tanque(String nombre, float vida, int ataque) {
        super(nombre, vida, ataque);
        
    }

    
    public float getVidaTanque() {
        return vida;
    }
    public void setVidaTanque(float vida) {
        this.vida = vida;
    }
    public int getAtaqueTanque() {
        return ataque;
    }
    public void setAtaqueTanque(int ataque) {
        this.ataque = ataque;
    }
    public void atacar(Tanque t1, Tanque t2) {
        t2.setVida(t2.getVida() - t1.getAtaqueTanque());
    }
    public boolean estaVivo() {
        if (getVida() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String imprimir() {
        return "[Tanque] " + super.imprimir();
    }
}
        

