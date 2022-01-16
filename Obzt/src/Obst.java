public abstract class  Obst<String> {
    private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;
     // Konztruktuer
     public Obst(String name){

         this.name=name;
     }

    public String getName(){

         return name;
    }
     //Getter
    public String getFarbe(){
        return  farbe;


    }
    //setter
    public void setFarbe (String farbe){
        this.farbe=farbe;
    }
    public double getGewicht(){
        return gewicht;

    }
    public void setGewicht(double gewicht){
        this.gewicht=gewicht;
    }
    public boolean isReif(){
        return reif;
    }
    public void setReife( boolean reif){
        this.reif=reif;
    }



}
