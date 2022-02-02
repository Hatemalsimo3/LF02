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
  public static void spielen(Spiel spiel){

     Random random=new Random();
     int maxnachspielzeit= random.nextInt(10);
     int spielzeit=90;
     int gesamtspielzeit=maxnachspielzeit+spielzeit;





  }
















}
