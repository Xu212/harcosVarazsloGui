package model;

import java.util.Random;

public class Karakter {

    private int eletero;
    private int pozicio;
    private String klassz;

    public Karakter(int elertero, int pozicio, String klassz) {
        this.eletero = elertero;
        this.pozicio = pozicio;
        this.klassz = klassz;
    }

    public Karakter(int pozicio, String klassz) {
        this(100, pozicio, klassz);
    }

    public void mozgas() {
        Random rnd = new Random();
        int ujpoz = rnd.nextInt(3);
        setPozicio(ujpoz);
    }
    
    public void harc(){
        int eletero = getEletero();
        
    }
    
    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }

    public int getPozicio() {
        return pozicio;
    }
    
}
