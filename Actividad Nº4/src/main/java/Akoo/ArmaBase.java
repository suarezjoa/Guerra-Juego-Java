package Akoo;

public abstract class ArmaBase extends Soldado {
    protected String nombreArma;
    protected float danio;

    public ArmaBase(String nombreArma, float danio, String nombre, float vida, int ataque) {
        super(nombre, vida, ataque);
        this.nombreArma = nombreArma;
        this.danio = danio;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public float getDanio() {
        return danio;
    }

    public void setDanio(float danio) {
        this.danio = danio;
    }

    
}
