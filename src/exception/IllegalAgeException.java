package exception;

/**
 * IllegalAgeException : 非法的年齡異常(自定義異常)
 * 1.自定義異常要見名知義
 * 2.需要繼承(直接或間接)Exception
 * 3.提供超類中所有的構造器
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {}

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
