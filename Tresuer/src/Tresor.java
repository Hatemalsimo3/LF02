import java.util.ArrayList;

public class Tresor {
    public ArrayList<Gegenstand> gegenstandArrayList;


    public Tresor(){
        gegenstandArrayList=new ArrayList<>();
    }


    public Gegenstand getGegenstand( int id) {

        return gegenstandArrayList.get(id);
    }

    public void addGegenstand(Gegenstand gegenstand){
        this.gegenstandArrayList.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand){
        this.gegenstandArrayList.remove(gegenstand);
    }
    public double brechneGesammtwert(){
        double gesammtwert = 0;
        for (Gegenstand v : gegenstandArrayList){
            gesammtwert += v.getWert();
        }
        return gesammtwert;
    }

}
