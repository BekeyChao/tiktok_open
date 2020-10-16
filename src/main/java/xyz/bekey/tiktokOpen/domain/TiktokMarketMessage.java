package xyz.bekey.tiktokOpen.domain;

public class TiktokMarketMessage {

    private int msgType;

    private String message;

    private MsgAuthInfo msgAuthInfo;

    private MsgOrderInfo msgOrderInfo;

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public MsgAuthInfo getMsgAuthInfo() {
        return msgAuthInfo;
    }

    public void setMsgAuthInfo(MsgAuthInfo msgAuthInfo) {
        this.msgAuthInfo = msgAuthInfo;
    }

    public MsgOrderInfo getMsgOrderInfo() {
        return msgOrderInfo;
    }

    public void setMsgOrderInfo(MsgOrderInfo msgOrderInfo) {
        this.msgOrderInfo = msgOrderInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
