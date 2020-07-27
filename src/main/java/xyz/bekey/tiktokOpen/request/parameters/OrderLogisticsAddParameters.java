package xyz.bekey.tiktokOpen.request.parameters;

public class OrderLogisticsAddParameters {

    private String order_id;

    private String logistics_id;

    private String logistics_code;

    public OrderLogisticsAddParameters(String order_id, Integer logistics_id, String logistics_code) {
        this.order_id = order_id;
        this.logistics_code = logistics_code;
        this.logistics_id = logistics_id.toString();
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getLogistics_id() {
        return logistics_id;
    }

    public String getLogistics_code() {
        return logistics_code;
    }
}
