package Java;

public class Zutat {
    private String name;
    private double preis;
    private boolean auswahl;
    private boolean readonly;
    
    public Zutat() {
    }
    
    public Zutat(String name, double preis, boolean auswahl, boolean readonly) {
        this.name = name;
        this.preis = preis;
        this.auswahl = auswahl;
        this.readonly = readonly;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPreis() {
        return preis;
    } 
    
    public void setPreis(double preis) {
        this.preis = preis;
    }
    
    public boolean getAuswahl() {
        return auswahl;
    }
    
    public void setAuswahl(boolean auswahl) {
        this.auswahl = auswahl;
    }
    
    public boolean getReadonly() {
        return readonly;
    }
    
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }
}
