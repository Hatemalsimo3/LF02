public abstract class  Trainer extends Person{


        private  int erfahrung ;

        public Trainer ( String name, int alter , int erfahrung ) {
            super("Hatem",14);


            this . erfahrung = erfahrung ;
        }



        public int geterfahrung () {

            return erfahrung ;
        }

        public void setErfahrung (int erfahrung) {

            this . erfahrung=erfahrung ;
        }

        public String toString () {
            String text = "\n\t erfahrung = "+ erfahrung;


            return text;

        }

}




