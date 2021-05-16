package xyz.bekey.tiktokOpen.request.parameters;

public class RefundListSearchParameters {
    private Long order_id;
    private Integer page;
    // 订单排序方式：最近的在前，1；最近的在后，0 默认1
    private Integer is_desc;
    // 0是所有，-1是正常，1是异常
    private Integer risk_flag;
    //排序字段，apply_time 售后申请时间
    //update_time 售后信息更新时间
    //默认apply_time
    private String order_by;
    private Integer size;
    private String start_time;
    private String end_time;
    //售后状态 1: 所有,
    //2: PreSaleAllAudit,发货前退款待处理
    //3: RefundAudit,发货后仅退款待处理
    //4: ReturnAudit,退货待处理
    //5: ExchangeAudit,换货待处理
    //6: RefundFail,同意退款、
    //退款失败 7: AuditRefund,同意退款、退款成功
    //8: AfterSaleAudit,待商家处理
    //9: ReturnReceive,待商家收货
    //10: AuditRefunding,同意退款，退款中
    //11: ArbitratePending,仲裁中
    //12: Close,售后关闭
    //13: ReturnShip,待买家退货
    //14: WaitBuyerReceive,换货待用户收货
    //15: ExchangeSuccess,换货成功
    //16: Refuse,拒绝售后
    //17: ReceiveRefuse,退货后拒绝退款
    //18: UploadRefund,待商家上传退款凭证
    private Integer status;

    //0: TypeReturn, 退货
    //1: TypeRefund, 售后仅退款
    //2: TypePreSaleAll, 售前退款
    //3: TypeExchange, 换货
    //5: TypeAll, 所有
    private Integer type;
    //1: LogisticsStatusAll, 所有
    //2: Shipped, 已发货
    //3: NotShipped, 未发货
    private Integer logistics_status;
    private Long aftersale_id;
    //支付方式 1: PayTpeAll, 所有
    //2: Cod, 货到付款
    //3: Online, 在线支付
    private Integer pay_type;
    //仲裁状态 1: ArbitrationStatusAll, 所有
    //2: ArbitrationStatusNone, 无仲裁
    //3: Pending, 仲裁中
    //4: Finished,仲裁结束
    private Integer arbitrate_status;
    //退款类型 0: Origin, 原路退回
    //1: Offline, 线下退款
    //2: Imprest,预付款退款
    //3: Pledge,保证金退款
    //4: None,无需退款
    //5: RefundTypeAll, 所有
    private Integer refund_type;
    //物流单号
    private String logistics_code;

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getIs_desc() {
        return is_desc;
    }

    public void setIs_desc(Integer is_desc) {
        this.is_desc = is_desc;
    }

    public Integer getRisk_flag() {
        return risk_flag;
    }

    public void setRisk_flag(Integer risk_flag) {
        this.risk_flag = risk_flag;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLogistics_status() {
        return logistics_status;
    }

    public void setLogistics_status(Integer logistics_status) {
        this.logistics_status = logistics_status;
    }

    public Long getAftersale_id() {
        return aftersale_id;
    }

    public void setAftersale_id(Long aftersale_id) {
        this.aftersale_id = aftersale_id;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getArbitrate_status() {
        return arbitrate_status;
    }

    public void setArbitrate_status(Integer arbitrate_status) {
        this.arbitrate_status = arbitrate_status;
    }

    public Integer getRefund_type() {
        return refund_type;
    }

    public void setRefund_type(Integer refund_type) {
        this.refund_type = refund_type;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }
}
