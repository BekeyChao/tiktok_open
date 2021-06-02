package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class ShopOrder extends BaseOrder {

    // 店铺ID
    private Long shop_id;

    // 商户名称
    private String shop_name;

    // 抖音小程序id
    private String open_id;

    private String buyer_words;

    private String seller_words;

    // 小程序id
    private Long app_id;

    // 支付流水号
    private String channel_payment_no;

    // 物流信息
    private List<LogisticsInfo> logistics_info;

    // 商品单信息
    private List<SkuOrder> sku_order_list;

    private Integer seller_remark_stars;

    private List<OrderPhase> order_phase_list;

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getBuyer_words() {
        return buyer_words;
    }

    public void setBuyer_words(String buyer_words) {
        this.buyer_words = buyer_words;
    }

    public String getSeller_words() {
        return seller_words;
    }

    public void setSeller_words(String seller_words) {
        this.seller_words = seller_words;
    }

    public Long getApp_id() {
        return app_id;
    }

    public void setApp_id(Long app_id) {
        this.app_id = app_id;
    }

    public String getChannel_payment_no() {
        return channel_payment_no;
    }

    public void setChannel_payment_no(String channel_payment_no) {
        this.channel_payment_no = channel_payment_no;
    }

    public List<LogisticsInfo> getLogistics_info() {
        return logistics_info;
    }

    public void setLogistics_info(List<LogisticsInfo> logistics_info) {
        this.logistics_info = logistics_info;
    }

    public List<SkuOrder> getSku_order_list() {
        return sku_order_list;
    }

    public void setSku_order_list(List<SkuOrder> sku_order_list) {
        this.sku_order_list = sku_order_list;
    }

    public Integer getSeller_remark_stars() {
        return seller_remark_stars;
    }

    public void setSeller_remark_stars(Integer seller_remark_stars) {
        this.seller_remark_stars = seller_remark_stars;
    }

    public List<OrderPhase> getOrder_phase_list() {
        return order_phase_list;
    }

    public void setOrder_phase_list(List<OrderPhase> order_phase_list) {
        this.order_phase_list = order_phase_list;
    }
}
