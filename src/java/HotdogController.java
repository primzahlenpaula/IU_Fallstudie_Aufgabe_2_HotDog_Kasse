package Java;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class HotdogController {
    
    public Hotdog getHotdog() {
        return Konfigurator.getInstance().getHotdog();
    }
    
    public static void updatePreis() {
        double preis = 0.00;
        ArrayList<Zutat> zutaten = Konfigurator.getInstance().getHotdog().getZutaten();
                  
        for (Zutat zutat:zutaten) {
            if (zutat.getAuswahl()) {
                preis = preis + (zutat.getPreis());
            }
        }
        Konfigurator.getInstance().getHotdog().setPreis(preis);
    }
}
