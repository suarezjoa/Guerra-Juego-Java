package Akoo;

public class Recursoobj {

    private int prio;
    private obj test;

    public int getPrio() {
        return prio;
    }
    public void setPrio(int prio) {
        this.prio = prio;
    }
    public obj getItem() {
        return test;
    }
    public void setItem(obj item) {
        this.test = item;
    }
    public Recursoobj(int prio, obj item) {
        this.prio = prio;
        this.test = item;
    }
    public Recursoobj(obj test){
        this.test=test;
    }
    public String imprimir() {
        return  ""+ this.prio + " " + this.test.getItem();

    }

}

