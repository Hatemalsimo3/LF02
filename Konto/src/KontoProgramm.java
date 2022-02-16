public class KontoProgramm {
    public static void main(String[] args) {



        Adresse adresse=new Adresse("luuneplate","12","12432","Bremen ");

        Mittarbeiter mittarbeiter=new Mittarbeiter("hatem","alsimo",adresse);
        System.out.println(adresse.toString());
        System.out.println(mittarbeiter.toString());

        Kunde kunde =new Kunde("abdol","cajaj",adresse,mittarbeiter);
        System.out.println(kunde.toString());
        Girokonto girokonto=new Girokonto(kunde,12,23,23);
        System.out.println(girokonto.toString());

        Sparkonto  sparkonto=new Sparkonto(kunde,121,10);
        System.out.println(sparkonto.toString());



    }
}
