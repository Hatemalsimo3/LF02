public abstract  class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimt;
    private double zinsGuthaben;


    public Konto (Kunde inhaber,double kreditLimt,double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kreditLimt = kreditLimt;
        this.zinsGuthaben=zinsGuthaben;

    }


    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimt() {
        return kreditLimt;
    }
    public void setKreditLimt(double kreditLimt){
        this.kreditLimt=kreditLimt;
    }
    public double getZinsGuthaben(){
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public void einzahlen(double betrag){
        kontoStand+=betrag;
    }
    public boolean auszahlen(double betrag){

        if(kontoStand-betrag>=0-kreditLimt){   //<-------------- rechnung

        }
        return true;

    }

    @Override

    public String toString (){
        String text= "\n\t Inhaber = " +inhaber;
        text+="\n\t Kontostand = " +kontoStand;
        text+="\n\t Kredit Limet = " +kreditLimt;
        text+="\n\t ZinsGuthaebn = "+zinsGuthaben;
        return text;
    }
}
