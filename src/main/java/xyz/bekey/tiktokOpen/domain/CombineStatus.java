package xyz.bekey.tiktokOpen.domain;

public class CombineStatus {

    // 子订单状态，可用","分隔多个状态
    private String order_status;

    // 主流程状态，仅支持103 - 预售订单已支付定金未付尾款
    private String main_status;

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getMain_status() {
        return main_status;
    }

    public void setMain_status(String main_status) {
        this.main_status = main_status;
    }
}
