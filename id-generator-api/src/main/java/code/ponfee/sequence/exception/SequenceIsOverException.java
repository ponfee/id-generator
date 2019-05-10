package code.ponfee.sequence.exception;

/**
 * 序列溢出
 * @author fupf
 */
public class SequenceIsOverException extends RuntimeException {

    private static final long serialVersionUID = 1336400947797460358L;

    /**
     * 错误编码
     */
    private int code = 0;

    /**
     * 默认构造函数
     */
    public SequenceIsOverException() {
        super();
    }

    /**
     * @param message 错误消息
     * @param cause 异常原因
     */
    public SequenceIsOverException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message 错误消息
     */
    public SequenceIsOverException(String message) {
        super(message);
    }

    /**
     * @param cause 异常根原因
     */
    public SequenceIsOverException(Throwable cause) {
        super(cause);
    }

    /**
     * @param code 错误编码
     * @param message 错误消息
     * @param cause 异常原因
     */
    public SequenceIsOverException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    /**
     * @param code 错误编码
     * @param message 错误消息
     */
    public SequenceIsOverException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * @param code 错误编码
     * @param cause 异常原因
     */
    public SequenceIsOverException(int code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    /**
     * 取得错误编码
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置错误编码
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

}
