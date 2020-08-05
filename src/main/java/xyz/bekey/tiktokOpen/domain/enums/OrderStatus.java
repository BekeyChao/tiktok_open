package xyz.bekey.tiktokOpen.domain.enums;

public enum OrderStatus {

    ReadyForPay(1, "在线支付订单待支付；货到付款订单待确认"),
    ReadyTransport(2, "备货中（只有此状态下，才可发货）"),
    Transported(3, "已发货"),
    Cancel(4, "已取消：1.用户未支付时取消订单；2.用户超时未支付，系统自动取消订单；3.货到付款订单，用户拒收"),
    Done(5, "已完成：1.在线支付订单，商家发货后，用户收货、拒收或者15天无物流更新；2.货到付款订单，用户确认收货"),
    Refund_Apply(6,"退货中-用户申请"),
    Refund_Agree(7, "退货中-商家同意退货"),
    Refund_Arbitration(8, "退货中-客服仲裁"),
    Refund_Close(9, "已关闭-退货失败"),
    Refund_Lose(10, "退货中-客服同意"),
    Refund_Address_Completed(11, "退货中-用户已填物流"),
    Refund_Success(12,"退货成功-商户同意"),
    Refund_Arbitration_Again(13, "退货中-再次客服仲裁"),
    Refund_Lose_Again(14,"退货中-客服同意退款"),
    Refund_Customer_Cancel(15,"退货-用户取消"),
    Refund_Apply_Ready(16,"退款中-用户申请(备货中)"),
    Refund_Agree_Ready(17, "退款中-商家同意(备货中)"),
    Refund_Success_Done_Ready(21, "退款成功-订单退款（备货中，用户申请退款，最终退款成功）"),
    Refund_Success_Done_Transport(22, "退款成功-订单退款 (已发货时，用户申请退货，最终退货退款成功)"),
    Refund_Success_Done_PayOnArrive(24, "退货成功-商户已退款 (货到付款订单，已发货时，用户申请退货，最终退货退款成功)"),
    Refund_Cancel_Ready(25, "退款中-用户取消(备货中)"),
    Refund_Cancel_Reject_Ready(26, "退款中-商家拒绝（备货中）"),
    Refund_Reject_Custom_Transport(27, "退货中-等待买家处理（已发货时，商家拒绝用户退货申请）"),
    Refund_Win_Transport(28, "退货失败（已发货时，商家拒绝用户退货申请，客服仲裁支持商家）"),
    Refund_Reject_Customer_Transport(29, "退货中-等待买家处理（已发货时，用户填写退货物流，商家拒绝）"),
    Refund_Apply_Transport(30, "退款中-退款申请（已发货时）"),
    Refund_Cancel_Transport(31, "退款申请取消（已发货时）"),
    Refund_Success_Transport(32, "退款成功-商家同意（已发货时）"),
    Refund_Reject_Transport(33, "退款中-商家拒绝（已发货时）"),
    Refund_Arbitration_Transport(34, "退款中-客服仲裁（已发货时）"),
    Money_Lose_Transport(35, "退款中-客服同意（已发货时）"),
    Money_Win_Transport(36, "退款中-退款失败（已发货时）"),
    Money_Close_Transport(37, "已关闭-退款失败（已发货时）"),
    Money_Success_Transport(38, "退款中-线下退款成功（已发货时）"),
    Money_Success(39, "退款中-退款成功（已发货时）");

//    ALL_Done(255, "");
    private int code;

    OrderStatus(int code, String desc) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

    public int getCode() {
        return code;
    }
}
