import jdk.swing.interop.SwingInterOpUtils;

public class Text {
    public static void main(String[] args) {


        Schmuck schmuck = new Schmuck(12354345,123,"Kette");
       schmuck.toString();
        System.out.println(schmuck);

         Aktie aktie = new Aktie(123123,100,"HAtem",232);
        System.out.println(aktie);
        Tresor tresor=new Tresor();
        tresor.toString();

    }
}
