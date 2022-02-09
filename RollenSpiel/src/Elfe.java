public class Elfe extends Spielfigur{


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }
    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte()+10>=0){
            setStaerkepunkte(getStaerkepunkte()-2);
            System.out.println(getName()+"rennt");
        }else{
            throw new KeineKraftException(getName(),"rennen");
        }
        int rennen=(getStaerkepunkte()-2);

    }
    @Override
    public String toString() {
       return super.toString();
    }
}
