public class Kunde extends Person {
    private Mittarbeiter betreuer;


    public Kunde (String vorname,String nachname,Adresse Adresse,Mittarbeiter betreuer){

        super (vorname,nachname, Adresse);
        this.betreuer=betreuer;

    }

    public Mittarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mittarbeiter betreuer) {
        this.betreuer = betreuer;
    }
    @Override
    public String toString(){
       String text ="\n\t Vorname  = " +getVorName();
       text+="\n\t Nachname = " +getNachName();
       text +="\n\t Betruer = "+ betreuer;
       return text;


    }
}
