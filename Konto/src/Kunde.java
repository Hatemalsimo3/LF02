public class Kunde extends Person {
    private Mittarbeiter betreuer;


    public Kunde (String vorname,String nachname,Mittarbeiter betreuer){
        super (vorname,nachname, betreuer.getAdresse());

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
       text +="\n\t Betruer = "+betreuer;
       return text;


    }
}
