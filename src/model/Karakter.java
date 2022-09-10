package model;
public class Karakter {
    int eletero;

    public Karakter(int elertero) {
        this.eletero = elertero;
    }
    
    public Karakter() {
        eletero = 100;
    }
    
    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }
    
}
