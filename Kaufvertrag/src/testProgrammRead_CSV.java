import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.temporal.ValueRange;

public class testProgrammRead_CSV {
    public static void main(String[] args) throws IOException {


        String datei = "H:/Dokumente/kaufvertrag.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));


        String zeile;
        while ((zeile = br.readLine()) != null) {

            String[] array = zeile.split(";");
            // verkaeufer
            if (array[0].equalsIgnoreCase("Verkaeufer")) {
                String vorname = "";
                String[] name = array[1].split(" ");
                for (int k = 0; k < name.length - 1; k++) {
                    vorname = vorname + name;
                    String nachname = name[name.length - 1];
                }
                Vertrapartner verkaeufer = new Vertrapartner(name[1], name[0]);
                String strasse = "";
                String[] strasseHausNr = array[2].split(" ");
                String hausNr = strasseHausNr[strasseHausNr.length - 1];
                for (int i = 0; i < strasseHausNr.length - 1; i++) {
                    strasse = strasse + strasseHausNr[i];
                }
                strasse.trim();

                String[] plzort = array[3].split(" ");
               String plz =plzort[0];
               String ort="";

                for (int j = 1; j < plzort.length; j++) {
                    ort=plzort[j];
                }
                ort.trim();

                Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
                verkaeufer.setAdresse(adresse);
                verkaeufer.getAusweisNr();
                System.out.println(verkaeufer);


// ---------------------------------------------------------------------------------------

                String zeile2;
                while ((zeile2 = br.readLine()) != null) {
                String[] array1 = zeile2.split(";");
                if (array1[0].equalsIgnoreCase("kaeufer")) {

                    String vorname1 = "";
                    String[] name1 = array[1].split(" ");
                    for (int m = 0; m < name1.length - 1; m++) {
                        vorname1 = vorname1 + name1;
                        String nachname1 = name1[name1.length - 1];
                    }
                    Vertrapartner kaeufer = new Vertrapartner(name1[1], name1[0]);

                    String strasse1 = "";
                    String[] strasseHausNr1 = array1[2].split(" ");
                    String hausNr1 = strasseHausNr1[strasseHausNr1.length - 1];
                    for (int n = 0; n < strasseHausNr1.length - 1; n++) {
                        strasse1 = strasse1 + strasseHausNr1[n];

                    }
                    strasse1.trim();


                    String[] plzort1 = array1[3].split(" ");
                    String plz2=plzort1[0];

                    String ort1 = "";
                    for (int v = 1; v < plzort1.length-1; v++) {
                      ort1 =plzort1[v];
                    }
                    ort1.trim();

                    Adresse adresse1 = new Adresse(strasse1, hausNr1, plz2, ort1);
                    kaeufer.setAdresse(adresse1);
                    kaeufer.getAusweisNr();
                    System.out.println(kaeufer);

                }
                }


            }

        }

    }}

