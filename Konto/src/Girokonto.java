public class Girokonto {
    private double zinsKredit;



    public Girokonto(Kunde inhaber,double kreditlimt,double zinsGuthabe,double zinsKredit){
        this.zinsKredit=zinsKredit;
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public boolean ueberweisen(double betrag , Girokonto girokonto){
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
