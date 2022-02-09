public class Program_RollenSpiel {

    public static void main(String[] args) {

        Zauberer seval=new Zauberer("HAtem",0);
        try{
            seval.zaubern();
        } catch (KeineKraftException e) {
            e.printStackTrace();
            System.out.println( e.Massge());
        }


    }

}
