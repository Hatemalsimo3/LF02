public class Girokonto  extends Konto{
    private double zinsKredit;



    public Girokonto(Kunde inhaber,double kreditlimt,double zinsGuthabe,double zinsKredit){
        super(inhaber,kreditlimt,zinsGuthabe,121);
        this.zinsKredit=zinsKredit;
    }
    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public boolean uberweisen(double betrag , Girokonto girokonto){

        if (auszahlen(betrag)) {
        auszahlen(betrag);
            girokonto.einzahlen(betrag);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String toString() {

        return super.toString();
    }
}
