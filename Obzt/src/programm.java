public  class  programm {
    public static void main(String[] args) {
        apffel apfel=new apffel();

       // apfel.getName();
        apfel.setFarbe( "grün");
        apfel.setGewicht(250);
        apfel.setReife(true);
        System.out.println("sie haben ein:");
        System.out.println("ihr Obst hat die farbe;"   + apfel.getFarbe());
        System.out.println("ihr apfell ist:"  +apfel.getGewicht()+  ":geram");
        System.out.println("ihr apffel ist:"+apfel.isReif()+ ":also ist ihr apfel reif");
         // Banane program
        banane banane=new banane();
        System.out.println(banane.getName());




    }
}
