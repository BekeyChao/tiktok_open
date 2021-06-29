package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.LogisticsAddress;

public class GetOutRangeParameter {

    private String logistics_code;

    private LogisticsAddress sender_address;

    private LogisticsAddress receiver_address;

    // 类型（0-揽派合一；1-揽收区域；2-派送区域） 0：取senderAddress, receiverAddress值, 1：取senderAddress值, 2：取receiverAddress值
    private Integer type;

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public LogisticsAddress getSender_address() {
        return sender_address;
    }

    public void setSender_address(LogisticsAddress sender_address) {
        this.sender_address = sender_address;
    }

    public LogisticsAddress getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(LogisticsAddress receiver_address) {
        this.receiver_address = receiver_address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
