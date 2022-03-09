import java.security.AllPermission;
import java.util.ArrayList;

public class Tresor {
    public ArrayList gegenschtand;
    private double gesammtwert;

    public Tresor(){

    }


    public ArrayList getGegenstand( int id) {
        return gegenschtand;
    }

    public void addGegenstand(Gegenstand gegenstand){
        gegenstand=gegenstand;

    }

    public void removeGegenstand(ArrayList gegenstand){
        this.gegenschtand=gegenstand;

    }
    public double brechneGesammtwert(){


        return gesammtwert;
    }

}
