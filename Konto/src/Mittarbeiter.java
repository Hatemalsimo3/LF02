public class Mittarbeiter extends Person {

    public Mittarbeiter(String vorname,String nachname,Adresse adresse){
        super (vorname,nachname,adresse);
    }

    @Override
    public String toString(){
        String text="\n\t vorname = "+getVorName();
        text+="\n\t Nachname  = " +getNachName();

        return text;


    }


}
