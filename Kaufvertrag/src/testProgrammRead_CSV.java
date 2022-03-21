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
                String[] name = array[1].split("");
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

                String plz1 = "";
                String[] plz = array[3].split("  ");
                String ort = plz[plz.length - 1];
                for (int j = 1; j < plz.length; j++) {
                    plz1 = plz1 + plz;

                }
                Adresse adresse = new Adresse(strasse, hausNr, plz1, ort);
                verkaeufer.setAdresse(adresse);


// ---------------------------------------------------------------------------------------

                String[] array1 = zeile.split(";");
                if (array1[0].equalsIgnoreCase("kaeufer")) {
                    String vorname1 = "";
                    String[] name1 = array[1].split("");
                    for (int m = 0; m < name1.length - 1; m++) {
                        vorname1 = vorname1 + name1;
                        String nachname1 = name1[name1.length - 1];
                    }
                    Vertrapartner kauefer = new Vertrapartner(name1[1], name1[0]);


                    String strasse1 = "";
                    String[] strasseHausNr1 = array1[2].split(" ");
                    String hausNr1 = strasseHausNr1[strasseHausNr1.length - 1];
                    for (int n = 0; n < strasseHausNr1.length - 1; n++) {
                        strasse1 = strasse1 + strasseHausNr1[n];

                    }
                    strasse1.trim();

                    String plz2 = "";
                    String[] plz3 = array1[3].split("  ");
                    String ort1 = plz3[plz3.length - 1];
                    for (int v = 1; v < plz3.length; v++) {
                        plz2 = plz2 + plz3;

                    }
                    Adresse adresse1 = new Adresse(strasse1, hausNr1, plz1, ort1);
                    kauefer.setAdresse(adresse1);
                    System.out.println(adresse);

                }


            }

        }

    }}

