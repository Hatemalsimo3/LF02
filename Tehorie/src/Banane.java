public class Banane extends Obst{

    private double kruemmung;
    private String alter;

   public Banane(){
       super("Banane");

   }
   public double getKruemmung(){
       return kruemmung;
   }
    public void setKrumung(){

       this.kruemmung = kruemmung;
    }
    @Override
    public String toString(){
       String text=super.toString();
       text += "\n\t krümung="+kruemmung;
       return  text;
    }



}
