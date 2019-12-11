package exceptions;

public class WrongProductInputException extends Exception {
    public WrongProductInputException(){
    }
    public WrongProductInputException(String msg){super(msg);}
}
