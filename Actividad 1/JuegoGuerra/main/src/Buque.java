public class Buque extends Ejercito {
    private String nombreBuque;

    public Buque(String nombre, float vida, int ataque, String nombreBuque) {
        super(nombre, vida, ataque);
        this.nombreBuque = nombreBuque;

    }
    public String getNombreBuque() {
        return nombreBuque;
    }
    public void setNombreBuque(String nombreBuque) {
        this.nombreBuque = nombreBuque;
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
    public void atacar(Buque b1, Buque b2) {
        b2.setVidaBuque(b2.getVidaBuque() - b1.getAtaqueBuque());
    }
    public boolean estaVivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
