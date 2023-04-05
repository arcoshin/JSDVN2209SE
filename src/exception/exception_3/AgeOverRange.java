package exception.exception_3;

public class AgeOverRange extends Exception {
    public AgeOverRange() {
    }

    public AgeOverRange(String message) {
        super(message);
    }

    public AgeOverRange(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeOverRange(Throwable cause) {
        super(cause);
    }

    public AgeOverRange(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
