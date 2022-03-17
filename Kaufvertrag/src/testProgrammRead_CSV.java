import java.io.*;
import java.nio.charset.StandardCharsets;

public class testProgrammRead_CSV {
    public static void main(String[] args) throws IOException {


        String datei = "Kaufvertrag";
        BufferedReader br =new BufferedReader(new FileReader(datei));

        String zeile;
        while ((zeile=br.readLine())!=null) {

        }

            String[] array = zeile.split("");
            if (array[0].equalsIgnoreCase("Verkaufer")) {
                String[] name = array[1].split("");
                Vertrapartner kaeufer = new Vertrapartner(name[0], name[1]);
                String[] adresse = array[1].split("");
                String[] adresse1 = array[2].split("");
                Vertrapartner verkaeufer = new Vertrapartner(name[0], name[1]);
            }

        }
    }

