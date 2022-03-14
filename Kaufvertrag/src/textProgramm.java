import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class textProgramm {
    public static void main(String[] args) throws FileNotFoundException {
        Ware ware = new Ware("Laptop", 250.0);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheiten().add("Tasche");
        ware.getBesonderheiten().add("Gaming-Maus");
        ware.getMaengel().add("Ladekabel fehlt");
        ware.getMaengel().add("Touchpad defekt");


        Vertrapartner kaeufer = new Vertrapartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("781235668346257");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertrapartner verkaeufer = new Vertrapartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");
        System.out.println(vertrag);

        String datei = "H:/Dokumente/test.txt";
        PrintWriter printWriter = new PrintWriter(datei);
        printWriter.println( "Kauf Vertrag");
        printWriter.println(kaeufer.toString());
        printWriter.println(verkaeufer.toString());
        printWriter.println(ware.toString());
        printWriter.println(vertrag.toString());
        printWriter.close();


    }




}
