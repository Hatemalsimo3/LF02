import java.util.ArrayList;

public class Manschaft extends Spieler  {
    private String nameTorwart;
    private String nameTrainer;
    private ArrayList<Spieler> spielerListe;
    private int motivation;
    private int staerke;

    public Manschaft(String NameTorwart, String NameTrainer, int motivation, int staerke){
        super("ahh",2,2,2,2,2);
        this.nameTorwart=NameTorwart;
        this.nameTrainer=NameTrainer;
        this.motivation=motivation;
        this.staerke=staerke;




    }



    public String getNameTorwart(){
        return nameTorwart;

    }
    public  void setNameTorwart(String nameTorwart){
        this.nameTrainer=nameTorwart;

    }

    public String getNameTrainer(){
        return nameTrainer;

    }

    public void setNameTrainer(String nameTrainer){
        this.nameTrainer=nameTrainer;
    }
    public int getmotivation(){


        return motivation;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }
    public int getStaerke(){
        return staerke;

    }
    public void setStaerker(int staerke) {
        this.staerke = staerke;
    }
    @Override
    public String toString(){
        String text="\n\t NameTorwart = " + nameTorwart;
        text+="\n\t NameTrainer =" + nameTrainer;
        text+="\n\t Motivation =" + motivation;
        text+="\n\t Spielerliste = " + spielerListe;
        text+="\n\t Staerke = " + staerke;
        return text;
    }
}
