public abstract class Gegenstand {
    private double wert;
    private int id;



    public Gegenstand(int id,double wert){
        this.wert=wert;
        this.id=id;

    }
    public  int getId(){
        return id;
    }


    public double getWert() {
        return wert;

    }



    public void setWert(double wert) {
        this.wert = wert;
    }

    @Override
    public String toString(){
        String text="\n\t Wert = " + wert;
        text+="\n\t ID   = " +id;
        return text;
    }
}
