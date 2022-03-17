import java.io.IOException;
import java.io.PrintWriter;

public class textProgrammWriteCSV {
    public static void main(String[] args) throws IOException {


        Vertrapartner kaeufer = new Vertrapartner("Klaus", "Brandt");

        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertrapartner verkaeufer = new Vertrapartner("Joachim", "Bredull");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

     // ____________________CSV Datei  ______________________

        String datei = "H:/Dokumente/kaufvertrag.csv";
        PrintWriter printWriter = new PrintWriter(datei);
        printWriter.println("Vertragpartner;name;Strasse;PLZ;ort");                       // Überschrift
        printWriter.println("Verkaufer;" +                          // verkaüfer         // Eigenschaften des verkaüfet und werden immer mit
                verkaeufer.getNachname()+""+                                          // ";" getrenn; +" " + <--- Das sorgt für bisen Abstand zwischen wörter
                verkaeufer.getVorname()+"; "+
                verkaeufer.adresse().getStrasse()+";"+
                verkaeufer.adresse().getPlz()+";"+
                verkaeufer.adresse().getOrt() );

        printWriter.println("kaufer;" +                              // kaüfer
                kaeufer.getNachname()+","+
                kaeufer.getVorname()+";"+
                kaeufer.adresse().getStrasse()+";"+
                kaeufer.adresse().getPlz()+";"+
                kaeufer.adresse().getOrt());
        printWriter.close();

        // ____________________CSV Datei ______________________




    }


}
