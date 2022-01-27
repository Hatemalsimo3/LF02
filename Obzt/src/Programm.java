public  class Programm {
    public static void main(String[] args) {
        Apfel apfel=new Apfel();

       // apfel.getName();
        apfel.setFarbe( "grün");
        apfel.setGewicht(250);
        apfel.setReife(true);
        System.out.println("sie haben ein:"+apfel.getName());
        System.out.println("ihr Obst hat die farbe;"   + apfel.getFarbe());
        System.out.println("ihr apfell ist:"  +apfel.getGewicht()+  ":geram");
        System.out.println("ihr apffel ist:"+apfel.isReif()+ ":also ist ihr apfel reif");
         // Banane program
        Banane banane=new Banane();
        System.out.println(banane.getName());
        Apfel Apfel=new Apfel();
        System.out.println(Apfel.getName());




    }
}
