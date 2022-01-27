import java.util.ArrayList;
import java.util.Random;

public class Fussbalprogram {
    public static void main(String[] args) {

        Trainer hatem=new Trainer("Abdul", 21, 0) {
        };
        System.out.println(hatem.toString());

        Torwart torwartHans = new Torwart("mo",12,0,0,12);

        Spieler spieler1 =new Spieler("haem",2,3,2,12,2);

        Spieler spieler2 = new Spieler("hatem1",13,2,3,2,3);

        ArrayList<Spieler> spielerArrayList=new ArrayList<>();
        spielerArrayList.add(spieler1);
        spielerArrayList.add(spieler2);


        Manschaft manschaft=new Manschaft("Huchting", torwartHans, hatem,spielerArrayList);
        System.out.println(manschaft);


        for ( int i=0;i<100;i++) {
            Random zufall = new Random();
            int u = zufall.nextInt(5) - 2;
            System.out.println(u);

        }





    }

}
