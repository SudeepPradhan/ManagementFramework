package exceptions;

@SuppressWarnings("serial")
public class InvalidArgumentException extends Exception {

    public InvalidArgumentException(Object object) {
        super(object.getClass().getSimpleName() + " is not valid. Check using validate()");
    }

}
