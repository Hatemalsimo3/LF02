public class Spiel {
        private Manschaft heim;
        private Manschaft gast;
        private Ergebnis ergebnis;
        private StringBuilder spielbericht;
        private StringBuilder Spielverlauf;
        private int Spielergebnis;

        Spiel(Manschaft heim, Manschaft gast) {
          this.heim=heim;
          this.gast=gast;

        }



    public Manschaft getHeim() {
            return heim;

        }

        public void setHeim(Manschaft heim) {
            this.heim=heim;
        }
        public Manschaft getGast(){
            return gast;

        }
        private Ergebnis getErgebnis(){
            return ergebnis;

        }
        public StringBuilder getSpielbericht(){
            return spielbericht;
        }

        @Override
        public String toString (){
            String text ="\n\t Heim  = " +heim;
            text += "\n\t Gast = " + gast;
            text+="\n\t Ergebnis = " +ergebnis;
            text+= "\n\t Spielbericht" +spielbericht;
            return text;

        }

}

