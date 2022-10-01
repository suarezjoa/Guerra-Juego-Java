package Akoo;

public class Ametralladora extends ArmaBase {
    int municiones;

    public Ametralladora(String nombreArma, float danio, String nombre, float vida, int ataque,int municiones) {
        super(nombreArma, danio, nombre, vida, ataque);
        this.municiones = municiones;
    }
    
    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }
    


    

    
    @Override
    public String imprimir() {
        return "[Ametralladora] " + super.imprimir();
    }
    
}
