

public class Ejercito {
    protected String nombre;
    protected float vida;
    protected int ataque;

    public Ejercito(String nombre, float vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacarTB(Tanque t1, Buque b1) {
        b1.setVida(b1.getVida() - t1.getAtaque());

    }

    public void atacarBS(Buque b1, Soldado s1) {
        s1.setVida(s1.getVida() - b1.getAtaque());
    }

    public void atacarTS(Tanque t1, Soldado s1) {
        s1.setVida(s1.getVida() - t1.getAtaque());
    }


    public void escudoSoldado(Escudo e1, Soldado s1){
        s1.setVida(s1.getVida() + (s1.getVida()*e1.getCantidad()));
    }

    public void escudoBuque(Escudo e1, Buque b1){
        b1.setVida(b1.getVida() + (b1.getVida()*e1.getCantidad()));
    }

    public void escudoTanque(Escudo e1, Tanque t1){
        t1.setVida(t1.getVida() + (t1.getVida()*e1.getCantidad()));
    }
}


