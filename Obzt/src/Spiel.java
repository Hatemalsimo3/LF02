public class Spiel {
    private StringBuilder Spielverlauf;
    private int Spielergebnis;

    private Spiel(StringBuilder Speilverlauf, int Spieleergbnis) {
        this.Spielverlauf = Speilverlauf;
        this.Spielergebnis = Spieleergbnis;

    }

    public StringBuilder getSpielverlauf() {
        return Spielverlauf;

    }

    public void setSpielergebnis(int spielergebnis) {
        this.Spielergebnis = spielergebnis;
    }

    @Override
    public String toString (){
        String text ="\n\t Spiel Verlauf = " +Spielverlauf;
        text += "\n\t Spiel Ergebnis = " + Spielergebnis;
        return text;

    }









}