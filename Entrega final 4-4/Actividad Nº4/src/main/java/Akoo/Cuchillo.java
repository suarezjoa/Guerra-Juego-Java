package Akoo;

public class Cuchillo extends ArmaBase {
    int cortes;
    float danioCuchillo;

    public Cuchillo(String nombreArma, float danio, String nombre, float vida, int ataque, int cortes) {
        super(nombreArma, danio, nombre, vida, ataque);
        this.cortes = 3;
        this.danioCuchillo = 0.5f;


    }

   


    public int getCortes() {
        return cortes;
    }

    public void setCortes(int cortes) {
        this.cortes = cortes;
    }

    @Override
    public String imprimir() {
        return "[Cuchillo] " + super.imprimir() + "[Cortes]" + this.cortes;
    }




    public float getDanioCuchillo() {
        return danioCuchillo;
    }




    public void setDanioCuchillo(float danioCuchillo) {
        this.danioCuchillo = danioCuchillo;
    }
    
  
    
}
