public class Ergebnis {

        private int toreHeim;
        private int toreGast;
        public Ergebnis (int toreHeim,int toreGast) {

            this.toreGast=toreGast;
            this.toreHeim=toreHeim;

        }
        public int getToreHeim(){
            return toreHeim;
        }

    public void addToreHeim(int toreHeim) {
        this.toreHeim = toreHeim;
    }
    public int getToreGast(){
            return toreGast;
    }

    public void addToreGast(int toreGast) {
        this.toreGast = toreGast;
    }

    @Override
        public String toString(){
            String text= "\n\t Tore Heim = " + toreHeim;
            text += "\n\t  Tore Gast = " + toreGast;
            return text;
        }




}

