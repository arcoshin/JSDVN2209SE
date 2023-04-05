package exception.exception_2;

public class UnCorrectAgeException extends Exception{
    public UnCorrectAgeException() {
    }

    public UnCorrectAgeException(String message) {
        super(message);
    }

    public UnCorrectAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnCorrectAgeException(Throwable cause) {
        super(cause);
    }

    public UnCorrectAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
