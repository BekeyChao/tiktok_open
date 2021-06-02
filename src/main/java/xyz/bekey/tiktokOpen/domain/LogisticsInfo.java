package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class LogisticsInfo {

    // 物流单号
    private String tracking_no;

    // 物流公司
    private String company;

    // 发货时间
    private Long ship_time;

    // 包裹id
    private String delivery_id;

    // 物流公司名称
    private String company_name;

    private List<ProductInfo> product_info;

    public String getTracking_no() {
        return tracking_no;
    }

    public void setTracking_no(String tracking_no) {
        this.tracking_no = tracking_no;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getShip_time() {
        return ship_time;
    }

    public void setShip_time(Long ship_time) {
        this.ship_time = ship_time;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public List<ProductInfo> getProduct_info() {
        return product_info;
    }

    public void setProduct_info(List<ProductInfo> product_info) {
        this.product_info = product_info;
    }
}
