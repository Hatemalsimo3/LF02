public abstract class  Spielfigur {
    private String name;
    private int staerkepunkte;


    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;

    }

    public Spielfigur() {

    }

    public String getName() {
        return name;

    }


    public int getStaerkepunkte() {
        return staerkepunkte;

    }

    public void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() throws KeineKraftException{
        if (staerkepunkte+10>=0){
            setStaerkepunkte(getStaerkepunkte()+10);
            System.out.println(getName()+"isst");
        }



    }

    public void laufen() throws KeineKraftException{
        if(getStaerkepunkte()-1>=0){
            setStaerkepunkte(getStaerkepunkte()-1);
            System.out.println(getName()+" laufen");
        }



    }

    public void klettern() throws KeineKraftException{
        if (getStaerkepunkte()-2>=0){
            setStaerkepunkte(getStaerkepunkte()-2);
            System.out.println(getName()+"klettern");
        }


    }

    public void kaempfen() throws KeineKraftException{
        if (getStaerkepunkte()-3>=0){
            setStaerkepunkte(getStaerkepunkte());
        }
        staerkepunkte = (getStaerkepunkte() - 3);

    }

    @Override
    public String toString() {
       return super.toString();


    }
}


