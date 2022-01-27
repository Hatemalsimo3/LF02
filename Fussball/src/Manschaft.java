import java.util.ArrayList;

public class Manschaft   {
        private int motivation;
        private int gesamtstearke;
        private int stearke;
        private String name;
        private Torwart nameTorwart;
        private Trainer nameTrainer;
        private ArrayList<Spieler> spielerListe;

        public Manschaft(String name,Torwart NameTorwart, Trainer NameTrainer,ArrayList<Spieler>spielerListe){
            this.name=name;
            this.nameTorwart=NameTorwart;
            this.nameTrainer=NameTrainer;
            this.spielerListe=spielerListe;




        }


        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

        public Torwart getNameTorwart(){
            return nameTorwart;

        }
        public  void setNameTorwart(Torwart nameTorwart){
            this.nameTorwart=nameTorwart;

        }

        public Trainer getNameTrainer(){
            return nameTrainer;

        }

        public void setNameTrainer(Trainer nameTrainer){
            this.nameTrainer=nameTrainer;
        }
        public int getMotivation(){

            for (Spieler s:spielerListe){
                motivation +=s.getMotivation();
            }
            motivation+= nameTorwart.getMotivation();
            motivation=motivation/(spielerListe.size()) +1;


            return motivation;
        }

        public int getGesamtstearke(){

            for (Spieler s:spielerListe){
                gesamtstearke +=s.getMotivation();
            }
            gesamtstearke+= nameTorwart.getMotivation();
            gesamtstearke=gesamtstearke/(spielerListe.size()) +1;

          return gesamtstearke;
        }


        public ArrayList<Spieler> getSpielerListe() {
            return spielerListe;
        }

        public void setSpielerListe(ArrayList<Spieler> spielerListe) {
            this.spielerListe = spielerListe;
        }

        @Override
        public String toString(){
            String text="\n\t Name =" +name;
            text+="\n\t NameTorwart = " + nameTorwart;
            text+="\n\t NameTrainer =" + nameTrainer;
            text+="\n\t Spielerliste = " + spielerListe;
            text+="\n\t GesammteMotivation =" +motivation;
            text+="\n\t Gesammtsterke=" +gesamtstearke;


            return text;
        }

}

