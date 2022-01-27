import java.security.SecureRandom;
import java.util.Random;

public class Gameplay {
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
      boolean vergleich=scheutze.getTorschuss()>torwart.getReaktion();

      System.out.println("Ein Tor");

      return (true);


  }
}
