public class Kaufvertrag {
    private Vertrapartner verkaeufer;
    private Vertrapartner kaeufer;
    private Ware ware;
    private String  zahlungsModalitaeten;


    public Kaufvertrag(Vertrapartner verkaeufer, Vertrapartner kaeufer , Ware waren){
        this.verkaeufer=verkaeufer;
        this.kaeufer=kaeufer;
        this.ware=waren;

    }

    public Vertrapartner getVerkaeufer(){
        return verkaeufer;

    }

    public Vertrapartner getKaeufer(){
        return  kaeufer;
    }

    public void setKaeufer(Vertrapartner kaeufer){
        this.kaeufer=kaeufer;

    }

    public Ware getWare() {
        return ware;
    }
    public void setWaren(Ware waren){
         this.ware=waren;
    }
    public String getZahlungsModalitaeten(){
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten){
        this.ware=ware;

    }

    @Override
    public String toString (){
        String text="\n\t Verkaefer   = " +verkaeufer;
         text+="\n\t  kaeufer   =  " + kaeufer;
         text +="\n\t Waren    = " + ware;
         text+= "\n\t zahlunsModalitaeten    = " + zahlungsModalitaeten;

         return text;
    }


}
