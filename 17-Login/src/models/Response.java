package models;

public class Response {
    public boolean ok;
    public String message;

    public Response(boolean ok, String message){
        this.ok = ok;
        this.message = message;
    }

    public boolean isOk(){
        return ok;
    }

    public String getMessage(){
        return message;
    }
}
