public class Tanque extends Ejercito {
    private String nombreTanque;
    

    public Tanque(String nombre, float vida, int ataque, String nombreTanque) {
        super(nombre, vida, ataque);
        this.nombreTanque = nombreTanque;
    }

    public String getNombreTanque() {
        return nombreTanque;
    }
    public void setNombreTanque(String nombreTanque) {
        this.nombreTanque = nombreTanque;
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
}
        

