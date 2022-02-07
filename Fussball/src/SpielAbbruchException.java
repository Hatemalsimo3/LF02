public class SpielAbbruchException extends Exception{

    private int Spielminute= 65;
    private String message;



    SpielAbbruchException(int Spielminute,String message){
        this.Spielminute=Spielminute;
        this.message=message;

    }



    public int getSpielminute(){
        return Spielminute;

    }
    public String getMassage(){
        return message;
    }


}
