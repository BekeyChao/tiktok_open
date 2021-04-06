package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class Order {

    private String order_id;

    private Long shop_id;

    // 在抖音小程序下单时，买家的抖音小程序ID
    private String open_id;

    private String pid;

    private List<Order> child;

    private Long product_id;
    private Long out_product_id;

    private String product_name;

    private String product_pic;

    // 该子订单购买的商品 sku_id
    private Long combo_id;
    private Long out_sku_id;

    private String code;

    private List<NameValue> spec_desc;

    private Address post_addr;

    private String post_code;

    private String post_receiver;

    private String post_tel;

    private String buyer_words;

    private String seller_words;

    private Integer logistics_id;

    private String logistics_code;

    private Long logistics_time;

    private Long receipt_time;

    private Integer order_status;

    private Integer final_status;

    // 订单类型 订单类型 (0:普通订单，2:虚拟订单，4:电子券)
    // (0实物，2普通虚拟，4poi核销，5三方核销，6服务市场)
    private Integer order_type;

    // 订单预售类型 (1:全款预售订单)
    private Integer pre_sale_type;

    private Long create_time;

    private Long update_time;

    private Long exp_ship_time;

    private String cancel_reason;
    // 支付类型 (0：货到付款，1：微信，2：支付宝）
    private Integer pay_type;

    private Long pay_time;

    private Integer combo_amount;

    private Integer combo_num;

    private Integer post_amount;

    // 达人ID
    private Long author_id;

    private AllianceInfo alliance_info;

    private Integer coupon_amount;

    private Integer shop_coupon_amount;

    private Long coupon_meta_id;

    private List<CouponInfo> coupon_info;

    private Long campaign_id;

    private List<CampaignInfo> campaign_info;

    // 店铺满减优惠信息(shop_campaign_id：店铺满减活动ID，shop_full_amount：分摊到该子订单上的满减金额，单位：分
//    private Integer shop_full_campaign;
    /**
     * 父订单总金额 (单位: 分) 即用户实际支付金额, 不包含运费
     */
    private Integer order_total_amount;

    /**
     * 该子订单总金额 (单位: 分)
     */
    private Integer total_amount;

    // 是否评价 (1:已评价)
    private Integer is_comment;

    // 催单次数
    private Integer urge_cnt;
    // 订单APP渠道
    private Integer b_type;

    // 订单来源类型
    //0:未知
    //1:app
    //2:小程序
    //3:h5
    private Integer sub_b_type;

    // 1	鲁班广告
    //2	联盟
    //4	商城
    //8	自主经营
    //10	线索通支付表单
    //12	抖音门店
    //14	抖+
    //15	穿山甲
    private Integer c_biz;

    /**
     * child_num 总会与child.size()一致，所以没有什么意义
     */
//    private Integer child_num;

    // 仓库ID
    private Integer warehouse_id;
    // 仓库外部ID
    private Integer out_warehouse_id;
    // 供应商ID
    private Integer warehouse_supplier;

    private Integer shipped_num;

    // 是否有退货运费险
    private String is_insurance;

    private List<String> item_ids;

    // 插旗信息
    private Integer seller_remark_stars;

    public String getIs_insurance() {
        return is_insurance;
    }

    public void setIs_insurance(String is_insurance) {
        this.is_insurance = is_insurance;
    }

    public Integer getSeller_remark_stars() {
        return seller_remark_stars;
    }

    public void setSeller_remark_stars(Integer seller_remark_stars) {
        this.seller_remark_stars = seller_remark_stars;
    }

    public Integer getShipped_num() {
        return shipped_num;
    }

    public void setShipped_num(Integer shipped_num) {
        this.shipped_num = shipped_num;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<Order> getChild() {
        return child;
    }

    public void setChild(List<Order> child) {
        this.child = child;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }

    public Long getCombo_id() {
        return combo_id;
    }

    public void setCombo_id(Long combo_id) {
        this.combo_id = combo_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NameValue> getSpec_desc() {
        return spec_desc;
    }

    public void setSpec_desc(List<NameValue> spec_desc) {
        this.spec_desc = spec_desc;
    }

    public Address getPost_addr() {
        return post_addr;
    }

    public void setPost_addr(Address post_addr) {
        this.post_addr = post_addr;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getPost_receiver() {
        return post_receiver;
    }

    public void setPost_receiver(String post_receiver) {
        this.post_receiver = post_receiver;
    }

    public String getPost_tel() {
        return post_tel;
    }

    public void setPost_tel(String post_tel) {
        this.post_tel = post_tel;
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

    public Integer getLogistics_id() {
        return logistics_id;
    }

    public void setLogistics_id(Integer logistics_id) {
        this.logistics_id = logistics_id;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public Long getLogistics_time() {
        return logistics_time;
    }

    public void setLogistics_time(Long logistics_time) {
        this.logistics_time = logistics_time;
    }

    public Long getReceipt_time() {
        return receipt_time;
    }

    public void setReceipt_time(Long receipt_time) {
        this.receipt_time = receipt_time;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public Long getExp_ship_time() {
        return exp_ship_time;
    }

    public void setExp_ship_time(Long exp_ship_time) {
        this.exp_ship_time = exp_ship_time;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Long getPay_time() {
        return pay_time;
    }

    public void setPay_time(Long pay_time) {
        this.pay_time = pay_time;
    }

    public Integer getCombo_amount() {
        return combo_amount;
    }

    public void setCombo_amount(Integer combo_amount) {
        this.combo_amount = combo_amount;
    }

    public Integer getCombo_num() {
        return combo_num;
    }

    public void setCombo_num(Integer combo_num) {
        this.combo_num = combo_num;
    }

    public Integer getPost_amount() {
        return post_amount;
    }

    public void setPost_amount(Integer post_amount) {
        this.post_amount = post_amount;
    }

    public Integer getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(Integer coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public Integer getShop_coupon_amount() {
        return shop_coupon_amount;
    }

    public void setShop_coupon_amount(Integer shop_coupon_amount) {
        this.shop_coupon_amount = shop_coupon_amount;
    }

    public Long getCoupon_meta_id() {
        return coupon_meta_id;
    }

    public void setCoupon_meta_id(Long coupon_meta_id) {
        this.coupon_meta_id = coupon_meta_id;
    }

    public List<CouponInfo> getCoupon_info() {
        return coupon_info;
    }

    public void setCoupon_info(List<CouponInfo> coupon_info) {
        this.coupon_info = coupon_info;
    }

    public Long getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(Long campaign_id) {
        this.campaign_id = campaign_id;
    }

    public List<CampaignInfo> getCampaign_info() {
        return campaign_info;
    }

    public void setCampaign_info(List<CampaignInfo> campaign_info) {
        this.campaign_info = campaign_info;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public Integer getIs_comment() {
        return is_comment;
    }

    public void setIs_comment(Integer is_comment) {
        this.is_comment = is_comment;
    }

    public Integer getUrge_cnt() {
        return urge_cnt;
    }

    public void setUrge_cnt(Integer urge_cnt) {
        this.urge_cnt = urge_cnt;
    }

    public Integer getB_type() {
        return b_type;
    }

    public void setB_type(Integer b_type) {
        this.b_type = b_type;
    }


    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public Integer getPre_sale_type() {
        return pre_sale_type;
    }

    public void setPre_sale_type(Integer pre_sale_type) {
        this.pre_sale_type = pre_sale_type;
    }

//    public Integer getShop_full_campaign() {
//        return shop_full_campaign;
//    }
//
//    public void setShop_full_campaign(Integer shop_full_campaign) {
//        this.shop_full_campaign = shop_full_campaign;
//    }

    public Integer getSub_b_type() {
        return sub_b_type;
    }

    public void setSub_b_type(Integer sub_b_type) {
        this.sub_b_type = sub_b_type;
    }

    public Integer getC_biz() {
        return c_biz;
    }

    public void setC_biz(Integer c_biz) {
        this.c_biz = c_biz;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Integer getOut_warehouse_id() {
        return out_warehouse_id;
    }

    public void setOut_warehouse_id(Integer out_warehouse_id) {
        this.out_warehouse_id = out_warehouse_id;
    }

    public Integer getWarehouse_supplier() {
        return warehouse_supplier;
    }

    public void setWarehouse_supplier(Integer warehouse_supplier) {
        this.warehouse_supplier = warehouse_supplier;
    }


    public Long getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(Long out_product_id) {
        this.out_product_id = out_product_id;
    }

    public Long getOut_sku_id() {
        return out_sku_id;
    }

    public void setOut_sku_id(Long out_sku_id) {
        this.out_sku_id = out_sku_id;
    }

    public Integer getOrder_total_amount() {
        return order_total_amount;
    }

    public void setOrder_total_amount(Integer order_total_amount) {
        this.order_total_amount = order_total_amount;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public AllianceInfo getAlliance_info() {
        return alliance_info;
    }

    public void setAlliance_info(AllianceInfo alliance_info) {
        this.alliance_info = alliance_info;
    }

    public Integer getFinal_status() {
        return final_status;
    }

    public void setFinal_status(Integer final_status) {
        this.final_status = final_status;
    }

    public List<String> getItem_ids() {
        return item_ids;
    }

    public void setItem_ids(List<String> item_ids) {
        this.item_ids = item_ids;
    }
}
