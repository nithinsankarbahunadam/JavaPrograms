public class NumberNoLikeException extends Exception {

    public NumberNoLikeException(){

    }

    public NumberNoLikeException(String Message){
        super(Message);

    }

    public NumberNoLikeException(String message, Throwable cause){
        super(message, cause);
    }
}
