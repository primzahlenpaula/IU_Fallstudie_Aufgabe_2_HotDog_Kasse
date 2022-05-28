package Java;

public class Zahlung {
    private String name;
    private boolean auswahl;
    private boolean readonly;
    
    public Zahlung() {
    }

    public Zahlung(String name, boolean auswahl, boolean readonly){
        this.name = name;
        this.auswahl = auswahl;
        this.readonly = readonly;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
      
     public boolean getAuswahl() {
        return auswahl;
    }
    
    public void setBar(boolean auswahl){
        this.auswahl = auswahl;
    }
    
     public boolean getReadonly() {
        return readonly;
    }
    
    public void setReadonly(boolean readonly){
        this.readonly = readonly;
    }
}

