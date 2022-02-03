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


        Gameplay gameplay=new Gameplay();











    }

}
