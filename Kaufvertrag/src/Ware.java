import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ware {

    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private  ArrayList <String > maengel;

    public Ware(String bezeichnung, double preis){
        this.bezeichnung=bezeichnung;
        this.preis=preis;
        this.besonderheiten = new ArrayList<>();
        this.maengel = new ArrayList<>();
    }

    public String getBezeichnung(){
        return bezeichnung;

    }
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung=bezeichnung;

    }

    public String getBeschreibung(){
        return  beschreibung;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung=beschreibung;
    }

    public double getPreis(){
        return  preis;
    }

    public void setPreis(double preis){
        this.preis=preis;
    }

    public ArrayList<String > getBesonderheiten(){
        return  besonderheiten;
    }

     public void setBesonderheiten(ArrayList<String > besonderheiten) {
         this.besonderheiten = besonderheiten;
     }
     public ArrayList<String> getMaengel(){
        return maengel;
     }

     @Override
    public String toString(){
        String text="\n\t  Bzeichnung =  " +bezeichnung;
        text+="\n\t  Beschreibung  = " +beschreibung;
        text+="\n\t  Preis  =  " +preis ;
        text+= "\n\t  Besonderheiten  =  "+besonderheiten;
        text+="\n\t  Mangel  =  " +maengel;
        return  text;
     }

}
