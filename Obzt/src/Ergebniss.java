public class Ergebniss {

    private int ergebnis1=0;
    private int ergebnis2=0;
    public Ergebniss (int ergebnis1,int ergebnis2) {

    }
    public int getErgebnis(){
        return ergebnis1;
    }
    public int getErgebnis2 (){
        return ergebnis2;
    }
    @Override
    public String toString(){
        String text= "\n\t Ergebniss von Manschaft 1 = " + ergebnis1;
        text += "\n\t Ergebnis von Manschaft 2 = " + ergebnis2;
        return text;
    }



}

