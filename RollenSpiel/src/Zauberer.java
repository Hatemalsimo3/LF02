public class Zauberer extends Spielfigur {
    private int zauberpunkte;

   public  Zauberer(String name,int staerkepunkte){
        super(name, staerkepunkte);
        this.zauberpunkte=zauberpunkte;
    }
    public int getZauberpunkte(){
        return zauberpunkte;

    }

     public void trinkenZaubertrank()throws KeineKraftException{
       int punkte =getZauberpunkte();
       if(punkte>=2){
           setStaerkepunkte(getStaerkepunkte()+3);
           System.out.println(getName()+ "  trinkt");
       }else throw new KeineKraftException("zaubern",getName());

     }
     public void zaubern()throws KeineKraftException{
       if(getStaerkepunkte()>=1){
           setStaerkepunkte(getStaerkepunkte()-1);
           System.out.println(getName()+"===zaubert");
       }else{
           throw new KeineKraftException("Zaubern",getName());
       }

   }

    @Override
    public String toString (){
       return super.toString()+"\nZauberPunkte:\t "+zauberpunkte;
    }


}
