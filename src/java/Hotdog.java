package Java;
import java.util.ArrayList;


public class Hotdog {
    private ArrayList<Zutat> zutaten = new ArrayList<Zutat>();
        private double preis = 3.00;
    
    public Hotdog(ArrayList<Zutat> zutaten) {
        this.zutaten = zutaten;
    }
    
    public ArrayList<Zutat> getZutaten() {
        return zutaten;
    }
    
    public void setZutaten(ArrayList<Zutat> zutaten) {
        this.zutaten = zutaten;
    }
    
    public double getPreis() {
        return preis;
    }
    
    public void setPreis(double preis) {
        this.preis = preis;
    }
}
