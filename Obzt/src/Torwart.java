import java.util.Random;

public  class Torwart extends Spieler{
    private  int reaktion;



    public Torwart(String name,int alter,int Starker,int motivation,int reaktion){
        super("HAtem",12,0,0,0,0);
        this.reaktion= reaktion;
    }

    public int getReaktion(){
        return  reaktion;
    }
    public void setReaktion(int reaktion){
        this.reaktion=reaktion;
    }
    @Override
    public String toString(){
        String text = "\n\tRektion" + reaktion;
        return text;
    }
}
