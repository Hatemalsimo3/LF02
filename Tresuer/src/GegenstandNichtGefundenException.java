public class GegenstandNichtGefundenException  {
    private int id;
    private String message;

    public GegenstandNichtGefundenException(int id,String message){
        this.id=id;
        this.message=message;
    }

    public int getId() {
        return id;
    }

   public String getMessage(){
        return message;
   }

}
