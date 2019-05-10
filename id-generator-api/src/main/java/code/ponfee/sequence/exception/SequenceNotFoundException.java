package code.ponfee.sequence.exception;

/**
 * 序列没有找到
 * @author fupf
 */
public class SequenceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 8202389462734865197L;

    private int code = 0;

    public SequenceNotFoundException() {
        super();
    }

    public SequenceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SequenceNotFoundException(String message) {
        super(message);
    }

    public SequenceNotFoundException(Throwable cause) {
        super(cause);
    }

    public SequenceNotFoundException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public SequenceNotFoundException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SequenceNotFoundException(int code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
