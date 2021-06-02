package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class SkuOrder extends BaseOrder {

    // 父订单号（店铺订单号）,不含字母A
    private String parent_order_id;

    private Integer order_level;

    // 流量来源：1-鲁班广告 2-联盟 3-商城 4-自主经营 5-线索通支付表单 6-抖音门店 7-抖+ 8-穿山甲
    private Integer send_pay;

    private String send_pay_desc;

    // 直播主播id（达人）
    private Long author_id;

    private String author_name;

    // 下单来源：1-直播间 2-短视频 3-文章
    private Integer theme_type;

    private String theme_type_desc;

    private Long app_id;

    // 直播间id
    private Long room_id;

    private String content_id;

    private String video_id;

    // 流量来源id
    private String origin_id;

    private Long cid;

    // C端流量来源业务类型 1:"鲁班广告" 2: "联盟" 4:return "商城" 8:"自主经营" 10:"线索/表单收集类广告" 12: "抖音门店" 14:"抖+" 15: "穿山甲" 16:"服务市场" 18: "服务市场外包客服"
    private Integer c_biz;

    private String c_biz_desc;

    private Long page_id;

    private String channel_payment_no;

    private String code;

    // 物流收货时间
    private Long logistics_receipt_time;

    // 用户确认收货时间
    private Long confirm_receipt_time;

    private Integer goods_type;

    private Long product_id;

    private Long sku_id;

    private List<NameValue> spec;

    private Integer first_cid;

    private Integer second_cid;

    private Integer third_cid;

    private Integer fourth_cid;

    private String out_sku_id;

    private String supplier_id;

    private String out_product_id;

    private Integer reduce_stock_type;

    private String reduce_stock_type_desc;

    private Integer origin_amount;

    private Boolean has_tax;

    private Integer item_num;

    private Integer sum_amount;

    private String source_platform;

    private String product_pic;

    private Integer is_comment;

    private String product_name;

    private List<Inventory> inventory_list;

    private Integer pre_sale_type;

    private AfterSaleInfo after_sale_info;

    public String getParent_order_id() {
        return parent_order_id;
    }

    public void setParent_order_id(String parent_order_id) {
        this.parent_order_id = parent_order_id;
    }

    @Override
    public Integer getOrder_level() {
        return order_level;
    }

    @Override
    public void setOrder_level(Integer order_level) {
        this.order_level = order_level;
    }

    public Integer getSend_pay() {
        return send_pay;
    }

    public void setSend_pay(Integer send_pay) {
        this.send_pay = send_pay;
    }

    public String getSend_pay_desc() {
        return send_pay_desc;
    }

    public void setSend_pay_desc(String send_pay_desc) {
        this.send_pay_desc = send_pay_desc;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Integer getTheme_type() {
        return theme_type;
    }

    public void setTheme_type(Integer theme_type) {
        this.theme_type = theme_type;
    }

    public String getTheme_type_desc() {
        return theme_type_desc;
    }

    public void setTheme_type_desc(String theme_type_desc) {
        this.theme_type_desc = theme_type_desc;
    }

    public Long getApp_id() {
        return app_id;
    }

    public void setApp_id(Long app_id) {
        this.app_id = app_id;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getOrigin_id() {
        return origin_id;
    }

    public void setOrigin_id(String origin_id) {
        this.origin_id = origin_id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getC_biz() {
        return c_biz;
    }

    public void setC_biz(Integer c_biz) {
        this.c_biz = c_biz;
    }

    public String getC_biz_desc() {
        return c_biz_desc;
    }

    public void setC_biz_desc(String c_biz_desc) {
        this.c_biz_desc = c_biz_desc;
    }

    public Long getPage_id() {
        return page_id;
    }

    public void setPage_id(Long page_id) {
        this.page_id = page_id;
    }

    public String getChannel_payment_no() {
        return channel_payment_no;
    }

    public void setChannel_payment_no(String channel_payment_no) {
        this.channel_payment_no = channel_payment_no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getLogistics_receipt_time() {
        return logistics_receipt_time;
    }

    public void setLogistics_receipt_time(Long logistics_receipt_time) {
        this.logistics_receipt_time = logistics_receipt_time;
    }

    public Long getConfirm_receipt_time() {
        return confirm_receipt_time;
    }

    public void setConfirm_receipt_time(Long confirm_receipt_time) {
        this.confirm_receipt_time = confirm_receipt_time;
    }

    public Integer getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(Integer goods_type) {
        this.goods_type = goods_type;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public List<NameValue> getSpec() {
        return spec;
    }

    public void setSpec(List<NameValue> spec) {
        this.spec = spec;
    }

    public Integer getFirst_cid() {
        return first_cid;
    }

    public void setFirst_cid(Integer first_cid) {
        this.first_cid = first_cid;
    }

    public Integer getSecond_cid() {
        return second_cid;
    }

    public void setSecond_cid(Integer second_cid) {
        this.second_cid = second_cid;
    }

    public Integer getThird_cid() {
        return third_cid;
    }

    public void setThird_cid(Integer third_cid) {
        this.third_cid = third_cid;
    }

    public Integer getFourth_cid() {
        return fourth_cid;
    }

    public void setFourth_cid(Integer fourth_cid) {
        this.fourth_cid = fourth_cid;
    }

    public String getOut_sku_id() {
        return out_sku_id;
    }

    public void setOut_sku_id(String out_sku_id) {
        this.out_sku_id = out_sku_id;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(String out_product_id) {
        this.out_product_id = out_product_id;
    }

    public Integer getReduce_stock_type() {
        return reduce_stock_type;
    }

    public void setReduce_stock_type(Integer reduce_stock_type) {
        this.reduce_stock_type = reduce_stock_type;
    }

    public String getReduce_stock_type_desc() {
        return reduce_stock_type_desc;
    }

    public void setReduce_stock_type_desc(String reduce_stock_type_desc) {
        this.reduce_stock_type_desc = reduce_stock_type_desc;
    }

    public Integer getOrigin_amount() {
        return origin_amount;
    }

    public void setOrigin_amount(Integer origin_amount) {
        this.origin_amount = origin_amount;
    }

    public Boolean getHas_tax() {
        return has_tax;
    }

    public void setHas_tax(Boolean has_tax) {
        this.has_tax = has_tax;
    }

    public Integer getItem_num() {
        return item_num;
    }

    public void setItem_num(Integer item_num) {
        this.item_num = item_num;
    }

    public Integer getSum_amount() {
        return sum_amount;
    }

    public void setSum_amount(Integer sum_amount) {
        this.sum_amount = sum_amount;
    }

    public String getSource_platform() {
        return source_platform;
    }

    public void setSource_platform(String source_platform) {
        this.source_platform = source_platform;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }

    public Integer getIs_comment() {
        return is_comment;
    }

    public void setIs_comment(Integer is_comment) {
        this.is_comment = is_comment;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public List<Inventory> getInventory_list() {
        return inventory_list;
    }

    public void setInventory_list(List<Inventory> inventory_list) {
        this.inventory_list = inventory_list;
    }

    public Integer getPre_sale_type() {
        return pre_sale_type;
    }

    public void setPre_sale_type(Integer pre_sale_type) {
        this.pre_sale_type = pre_sale_type;
    }

    public AfterSaleInfo getAfter_sale_info() {
        return after_sale_info;
    }

    public void setAfter_sale_info(AfterSaleInfo after_sale_info) {
        this.after_sale_info = after_sale_info;
    }
}
