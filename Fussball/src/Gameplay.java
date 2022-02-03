import java.security.SecureRandom;
import java.util.Random;

public class Gameplay  {
    private static final int spielzeit=90;
    private static final int maxnachspielzeit=5;
    private static int maxdauerbisaktion=10;

    // schritt 1
  private static int ermittelManschaftswert(Manschaft manschaft){
      int manschaftswert=Math.max(1,manschaft.getMotivation()*manschaft.getMotivation()*manschaft.getGesamtstearke()* manschaft.getNameTrainer().geterfahrung());
       return manschaftswert;
  }
  // schritt-
  private static boolean erzeilteTor(Spieler scheutze,Torwart torwart) {

      boolean tor=scheutze.getTorschuss()>torwart.getReaktion();
      Random random=new Random();
      int wert1= random.nextInt(5)-2;
      int wert2=random.nextInt(5)-2;
      int torschuss=scheutze.getTorschuss()+wert1;
      if(torschuss<=0){
          torschuss=1;
      }

      int rekation=torwart.getReaktion()+wert2;
      if (rekation<=0){
          rekation=1;
      }
      tor=torschuss >rekation;

      return tor;

  }


        /**
       * Simuliert ein Spiel.
       * @param spiel Das zu spielende Spiel.
       */
      public static void spielen(Spiel spiel) {
          Random random = new Random();
          Manschaft offensiv;
          Manschaft defensiv;
          // Zufällige Spieldauer festlegen
          int spielDauer = spielzeit + random.nextInt(maxnachspielzeit + 1);
          // Zufällige Spielminute für erste Aktion festlegen
          int spielMinute = 1 + random.nextInt(maxdauerbisaktion + 1);
          do {
              // Ermittlung der offensiven bzw. defensiven Mannschaft
              int heimWert = ermittelManschaftswert(spiel.getHeim());
              int gastWert = ermittelManschaftswert(spiel.getGast());
              int summe = heimWert + gastWert;
              int zufall = random.nextInt(summe + 1);
              if (zufall <= heimWert) {
                  offensiv = spiel.getHeim();
                  defensiv = spiel.getGast();
              }
              else {
                  offensiv = spiel.getGast();
                  defensiv = spiel.getHeim();
              }
              // Schütze bestimmen
              int schuetzeNr = random.nextInt(offensiv.getSpielerListe().size());
              Spieler schuetze = offensiv.getSpielerListe().get(schuetzeNr);
              // Ermitteln ob Torschuss erfolgreich oder nicht
              boolean getroffen = erzieltTor(schuetze, defensiv.getNameTorwart());
              if (getroffen) {
                  schuetze.getTore();
                  if (offensiv == spiel.getHeim()) {
                      spiel.getErgebnis().getToreHeim();
                  }
                  else {
                      spiel.getErgebnis().getToreGast();
                  }
                  spiel.getSpielbericht().append(spielMinute + ": Tor von " + schuetze.getName() + "!\n");
              }
              else {
                  spiel.getSpielbericht().append(spielMinute + ": Schuss von " + schuetze.getName() + " gehalten.\n");
              }
              // Zufällige Spielminute für nächste Aktion festlegen
              spielMinute = spielMinute + random.nextInt(maxdauerbisaktion + 1);
          } while(spielMinute <= spielDauer);
          spiel.getSpielbericht().append(spiel.getErgebnis());
      }



    /**
       * Errechnet den aktuellen Stärkewert eine Mannschaft.
       * Errechnet sich aus der Spielstärke und Motivation der Mannschaft und der Erfahrung des Trainers.
       * @return Der Stärkewert.
       */
      private static int ermittelMannschaftsWert(Manschaft mannschaft) {
          int wert = mannschaft.getGesamtstearke() * mannschaft.getMotivation() * mannschaft.getNameTrainer().geterfahrung();
          wert = Math.max(1, wert);
          return wert;
      }

      /**
       * Ermittelt, ob ein Torschuss erfolgreich ist oder nicht.
       * @param schuetze Der Torschütze.
       * @param torwart Der Torwart.
       * @return Ja, wenn der Torschuss erfolgreich ist. Sonst nein.
       */
      private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
          boolean getroffen;
          Random random = new Random();
          // Stärke des Schusses ermitteln
          int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;
          schuss = Math.max(1, schuss);
          // Stärke der Abwehr ermitteln
          int abwehr = torwart.getReaktion() + random.nextInt(5) - 2;
          abwehr = Math.max(1, abwehr);
          // Ermitteln, ob Schütze trifft
          if (schuss > abwehr) {
              getroffen = true;
          }
          else {
              getroffen = false;
          }
          return getroffen;
      }

  }



