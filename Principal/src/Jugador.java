public class Jugador extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Jugador(int id,String nombre, String apellido, int  edad, int dorsal, String demarcacion){
        super(id, nombre , apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    void jugarPartido(){

    }
    
    void entrenar(){

    }
    
    public String toString(){
        return super.toString() + "Dorsal: " + dorsal + " Demarcacion: " + demarcacion;
    }
}