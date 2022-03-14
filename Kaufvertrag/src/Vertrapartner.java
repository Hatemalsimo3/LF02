public class Vertrapartner {

    private String vorname;
    private String nachname;
    private String ausweisNr;
    private Adresse adresse;


    public Vertrapartner(String vorname, String nachname ){
        this.vorname=vorname;
        this.nachname=nachname;
      ;
    }
    public String getVorname(){
        return vorname;

    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public void setNachname(String nachname){
        this.nachname=nachname;
    }
    public String getAusweisNr(){
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse adresse(){
        return adresse;
    }


    public void setAdresse (Adresse adresse){
        this.adresse=adresse;
    }
    @Override
    public String toString (){
        String text= "\n\t  Vorname   = " + vorname;
        text+= "\n\t Nachname = " +nachname;
        text += " \n\t  AusweissNr  = " +ausweisNr;
        text += "\n\t Adresse  =  " +adresse;
        return  text;

    }

}
