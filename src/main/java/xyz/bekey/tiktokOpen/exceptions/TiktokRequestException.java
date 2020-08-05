package xyz.bekey.tiktokOpen.exceptions;

public class TiktokRequestException extends RuntimeException {

    private int errCode;
    private String errMsg;

    public TiktokRequestException(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public TiktokRequestException(int errCode, String errMsg, Throwable e) {
        super(e);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
