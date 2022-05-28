package Java;
import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class Konfigurator {
    private static Konfigurator instance = new Konfigurator();
    private Hotdog hotdog;
    private ArrayList<Zahlung> zahlung = new ArrayList<Zahlung>();

    public Konfigurator() {
        //Zutatenliste des Hotdogs
        ArrayList <Zutat> zutaten = new ArrayList<Zutat>();
        zutaten.add(new Zutat("Hotdog Basic", 3.00, true, true));
        zutaten.add(new Zutat("Röstzwiebeln", 1.00, false, false));
        zutaten.add(new Zutat("Essiggurken", 0.50, false, false));
        zutaten.add(new Zutat("Guacamole", 1.00, false, false));
        zutaten.add(new Zutat("Ketchup", 0.80, false, false));
        zutaten.add(new Zutat("Vegane Wurst", 1.50, false, false));
        hotdog = new Hotdog(zutaten);
        
        //Liste der Zahlungsmöglichkeiten
        zahlung.add(new Zahlung("Bar",false, false));
        zahlung.add(new Zahlung("Karte",true, false));
    }
    
    
    
    public Hotdog getHotdog() {
        return hotdog;
    }
    
    public static Konfigurator getInstance() {
        return instance;
    }
    
    public ArrayList<Zahlung> getZahlung(){
        return zahlung;
    }
    
    public void setZahlung(ArrayList<Zahlung> zahlung){
        this.zahlung = zahlung;
    }
    
}
