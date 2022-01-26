import javax.naming.Name;
import java.util.ArrayList;

public class ProgramFusball   {
    public static void main(String[] args) {
        Torwart torwart1=new Torwart("HAtem",17,0,5,6);
        System.out.println(torwart1.getReaktion() );
        System.out.println(torwart1.getTore());
        System.out.println(torwart1.getMotivation());





        Manschaft manschaft=new Manschaft("Hatem","hatem1",4,12);
        System.out.println(manschaft.getNameTorwart());
        System.out.println(manschaft.getMotivation());
        manschaft.toString();
        System.out.println(manschaft.toString());






    }
}