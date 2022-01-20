public class Spieler extends Trainer{

    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler (String name,int staerke,int torschuss, int motivation,int tore){
        super("Spielr,",2,3);
    }

    public String getname(){

        return name;
    }
    public void setname(String name){

        this.name=name;
    }

    public int getalter() {
        return alter;
    }
    public void setalter(int alter){
        this.alter=alter;
    }

    public int getStaerke() {
        return staerke;
    }
    public void setStaerke(int staerke){

        this.staerke=staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getTore() {
        return tore;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    public String toString(){
        String text = "\n\t Name =" + name;
        text +="\n\t Alter = " + alter;
        text +="\n\t Staerke = " + staerke;
        text += "\n\t Toraschuss = " +torschuss;
        text += "\n\t Motivation = " +motivation;
        text += "\n\t Tore = " + tore;

        return text;
    }
}
