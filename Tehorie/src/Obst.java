import javax.swing.plaf.synth.SynthSpinnerUI;

public abstract class  Obst {
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

    @Override   // damit mann wenn man toSting falsch schreibt wird es angezeigt
    public String toString(){
        String text="Name = "+name;
        text +="\n\t Farbe = "+farbe;
        text+="\n\t Gewicht = "+ gewicht;
        text+="\n\t reif = " + reif;

        return text;
    }


}
