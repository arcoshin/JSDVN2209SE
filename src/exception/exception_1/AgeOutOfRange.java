package exception.exception_1;

public class AgeOutOfRange extends Exception {
    public AgeOutOfRange() {}

    public AgeOutOfRange(String message) {
        super(message);
    }

    public AgeOutOfRange(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeOutOfRange(Throwable cause) {
        super(cause);
    }

    public AgeOutOfRange(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
