import java.util.ArrayList;
import java.util.Random;

public class Fussbalprogram {
    public static void main(String[] args) {

        Trainer hatem=new Trainer("Abdul", 21, 2) ;
        System.out.println("Trainer Name ist = "+ hatem.getName());
        System.out.println("Trainer Alter = "+hatem.getAlter());
        System.out.println("Trainers Erfahrung ist =" +hatem.geterfahrung());

        Torwart torwartHans = new Torwart("mo",12,0,0,12);
        System.out.println("Name des Torwartes ist =" + torwartHans.getName());
        System.out.println("Torwart Alter = " + torwartHans.getAlter());
        System.out.println("Torwart stearke ist =" +torwartHans.getStaerke());
        System.out.println( "Torwart Motivation = "+torwartHans.getMotivation());
        System.out.println("Torwart Reaktion ist = " +torwartHans.getReaktion());


        Spieler spieler1 =new Spieler("haem",2,3,2,12,2);

        Spieler spieler2 = new Spieler("hatem1",13,2,3,2,3);

        ArrayList<Spieler> spielerArrayList=new ArrayList<>();
        spielerArrayList.add(spieler1);
        spielerArrayList.add(spieler2);


        Manschaft manschaft=new Manschaft("Huchting", torwartHans, hatem,spielerArrayList);
        System.out.println(manschaft);


        /**////////////////////////////////////////////////////////////////////////////////////////////

      Trainer trainergast=new Trainer("aumar",12,12);
        System.out.println(trainergast);  System.out.println("Trainer Name ist = "+ trainergast.getName());
        System.out.println("Trainer Alter = "+trainergast.getAlter());
        System.out.println("Trainers Erfahrung ist =" +trainergast.geterfahrung());

        Torwart torwartmo = new Torwart("amed",18,23,3,12);
        System.out.println("Name des Torwartes ist =" + torwartmo.getName());
        System.out.println("Torwart Alter = " + torwartmo.getAlter());
        System.out.println("Torwart stearke ist =" +torwartmo.getStaerke());
        System.out.println( "Torwart Motivation = "+torwartmo.getMotivation());
        System.out.println("Torwart Reaktion ist = " +torwartmo.getReaktion());

        Spieler spieler12 =new Spieler("ubaida",23,24,0,10,4);

        Spieler spieler20 = new Spieler("hatem1",33,12,0,22,3);

        ArrayList<Spieler> spielerArrayListe=new ArrayList<>();
        spielerArrayList.add(spieler12);
        spielerArrayList.add(spieler20);

        Manschaft manschaftgast=new Manschaft("ferhat",torwartmo,trainergast,spielerArrayListe);


        Spiel spiel=new Spiel(manschaft,manschaftgast);
        System.out.println(spiel);
























    }

}
