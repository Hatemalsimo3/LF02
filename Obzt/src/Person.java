public abstract  class Person {

    private String Name;

    private int alter;

    public Person(String Name,int alter){
        super();

        this.Name=Name;
        this.alter=alter;

    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public int getAlter(){
        return alter;

    }

    public void setAlter (int alter ){
        this.alter=alter;
    }
    @Override
    public String toString(){
        String text="\n\t Name =" +Name;
        text +="\n\t alter =" +alter;
        return text;
    }


}
