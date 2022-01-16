public class Tiere {
    private String name;
    private int gewicht;
    private int größe;
    private String aussehen;



    public Tiere(String name){
        this.name=name;
    }
    public String getName() {

        return name;
    }
    public  Tiere (int gewicht){
        this.gewicht=gewicht;
    }
    public int getwicht(){
        return gewicht;
    }

    public void setgewicht(int gewicht){
        this.gewicht=gewicht;

    }
    public int getgröße(){
        return größe;
    }
    public void setgröße(int größe) {
        this.größe=größe;
    }
    public String getaussehen (){
        return aussehen;
    }
    public void setaussehen(String aussehen){
        this.aussehen=aussehen;
    }

}
