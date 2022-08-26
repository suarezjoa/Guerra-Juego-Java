public class Soldado extends Ejercito {
    private String nombreSoldado;
    

    public Soldado(String nombre, int vida, int ataque, String nombreSoldado) {
        super(nombre, vida, ataque);
        this.nombreSoldado = nombreSoldado;
        

    }




    public String getNombreSoldado() {
        return nombreSoldado;
    }

    public void setNombreSoldado(String nombreSoldado) {
        this.nombreSoldado = nombreSoldado;
    }

    public void atacarSoldado(Soldado s1, Soldado s2) {
        s2.setVida(s2.getVida() - s1.getAtaque());
    }

    public boolean estaVivoSoldado() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }


    


 


    
}
