public abstract class  Trainer {
    private String Name;
    private int alter;
    private  int erfahrung;


    // konzroktuer

    public Trainer(String Name,int alter,int erfahrung){
        this.Name=Name;
        this.alter=alter;
        this.erfahrung=erfahrung;


    }





    // Bei getter kann man lesen aber nicht ändern

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;

    }

    public int getAlter(){

        return alter;
    }
    public void setAlter(int alter){
        this.alter=alter;

    }

    public int getErfahrung(){
        return erfahrung;
    }

    public void setErfahrung (int erfahrung){
        this .erfahrung=erfahrung;
    }
    @Override
    public String toString(){
       String text = "\n\tName ="  + Name;
        text+="alter\n\t =" + alter;
        text+="erfahrung\n\t = " + erfahrung;

        return text;
    }
}
