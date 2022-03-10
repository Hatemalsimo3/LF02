import java.util.ArrayList;

public class Tresor {
    public ArrayList<Gegenstand> gegenstandArrayList;


    public Tresor(){
        gegenstandArrayList=new ArrayList<>();
    }


    public Gegenstand getGegenstand( int id) {

        return gegenstandArrayList.get(id);
    }

    public void addGegenstand(Gegenstand gegenstand){ /// gegenständen werden hinzugefügt mit hilfe von **add**
        this.gegenstandArrayList.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand){ ///gegenständen werden rausgeholt mit hilfe *** remove***
        this.gegenstandArrayList.remove(gegenstand);
    }
    public double brechneGesammtwert(){                    // methode die alle werte im tesor  zusammen brechenet.
        double gesammtwert = 0;
        for (Gegenstand v : gegenstandArrayList){
            gesammtwert += v.getWert();
        }
        return gesammtwert;

    }
    @Override
    public String  toString(){
        String text="\n\t Gegenstände gie im tresor liegen " + gegenstandArrayList;
        text+="\n\t Gesammwert der in im tresour liegt " + brechneGesammtwert();
        return text;
    }



}
