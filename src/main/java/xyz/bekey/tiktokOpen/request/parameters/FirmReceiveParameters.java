package xyz.bekey.tiktokOpen.request.parameters;

import java.util.Objects;

public class FirmReceiveParameters {
    private Long order_id;
    //处理方式：
    //1：确认收货并退款
    //2：拒绝
    private Integer type;
    //1	未收到货（未填写退货单号）
    //2	退货与原订单不符（商品不符、退货地址不符）
    //3	退回商品影响二次销售/订单超出售后时效（订单完成超7天）
    //4	买家误操作/取消申请
    //5	已与买家协商补偿，包括差价、赠品、额外补偿
    //6	已与买家协商补发商品/已与买家协商换货
    private Integer comment;
    private String evidence;

    public FirmReceiveParameters(Long order_id) {
        this.order_id = order_id;
        this.type = 1;
    }

    public FirmReceiveParameters(Long order_id, Integer comment) {
        this.order_id = order_id;
        this.type = 2;
        this.comment = comment;
    }

    public FirmReceiveParameters(Long order_id, Integer comment, String evidence) {
        this.order_id = order_id;
        this.type = 2;
        this.comment = comment;
        this.evidence = evidence;
    }

    private String getEvidence() {
        return this.evidence;
    }

    public String getOrder_id() {
        return order_id.toString();
    }

    public String getType() {
        return type.toString();
    }

    public String getComment() {
        return Objects.toString(comment, null);
    }

    private String getRegister() {
        return "1";
    }

    private String getPackage() {
        return "1";
    }

    private String getFacade() {
        return "1";
    }

    private String getFunction() {
        return "1";
    }
//    private String register;
//    private String package;

}
