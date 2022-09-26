package Akoo;
public class Escudo {
    private float cantidad;

    public Escudo(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String imprimir() {
        return "[Escudo] Cantidad: " + cantidad;
    }

    
}
