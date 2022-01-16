public class Programm2 {
    public static void main(String[] args) {
        Tiere affe=new Tiere("affel");
        affe.setgewicht(50);
        affe.setaussehen("grau und schwarz");
        affe.setgröße(1);
        affe.setaussehen("blau,grau");
        System.out.println("Der Tier ist ein;"+affe.getName());
        System.out.println("Der Affe wiegt" + affe.getwicht()+   "gram");
        System.out.println("Der Affe  hat die Farbe "+affe.getaussehen());
        System.out.println("");
        System.out.println("DEr affe ist"+affe.getgröße()+"m groß");


    }

}
