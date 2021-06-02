package xyz.bekey.tiktokOpen.domain;

public class BaseOrder {

    // 店铺或商品（父、子）订单号
    private String order_id;

    // 订单层级
    private Integer order_level;

    // 业务来源：1-鲁班 2-小店 3-好好学习等
    private Integer biz;

    // 业务来源描述
    private String biz_desc;

    // 订单类型：0-普通订单 2-虚拟订单 4-平台券码 5-商家券码
    private Integer order_type;

    // 订单类型描述
    private String order_type_desc;

    // 交易类型：1-拼团 2-定金预售
    private Integer trade_type;

    // 交易类型描述
    private String trade_type_desc;

    private Integer order_status;

    private String order_status_desc;

    private Integer main_status;

    private String main_status_desc;

    private Long pay_time;

    private Integer pay_type;

    // 订单过期时间
    private Long order_expire_time;

    // 订单完成时间
    private Long finish_time;

    private Long create_time;

    private Long update_time;

    private String cancel_reason;

    // 下单端：0-站外 1-火山 2-抖音等
    private Integer b_type;

    private String b_type_desc;

    // 下单场景：0 未知 1 app 2 小程序 3 H5
    private Integer sub_b_type;

    private String sub_b_type_desc;

    private Integer order_amount;

    private Integer pay_amount;

    private Integer post_amount;

    private Integer post_insurance_amount;

    private Integer modify_amount;

    private Integer modify_post_amount;

    // 单优惠总金额= 店铺优惠金额+ 平台优惠金额+ 达人优惠金额+ 支付优惠金额
    private Integer promotion_amount;

    // 店铺优惠金额
    private Integer promotion_shop_amount;

    // 平台优惠金额
    private Integer promotion_platform_amount;

    // 平台优惠金额卖家承担部分
    private Integer shop_cost_amount;

    // 平台优惠金额平台承担部分
    private Integer platform_cost_amount;

    // 达人优惠金额
    private Integer promotion_talent_amount;

    // 支付优惠金额
    private Integer promotion_pay_amount;

    private String post_tel;

    private String post_receiver;

    private Address post_addr;

    // 预计发货时间
    private Long exp_ship_time;

    // 发货时间
    private Long ship_time;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_level() {
        return order_level;
    }

    public void setOrder_level(Integer order_level) {
        this.order_level = order_level;
    }

    public Integer getBiz() {
        return biz;
    }

    public void setBiz(Integer biz) {
        this.biz = biz;
    }

    public String getBiz_desc() {
        return biz_desc;
    }

    public void setBiz_desc(String biz_desc) {
        this.biz_desc = biz_desc;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getOrder_type_desc() {
        return order_type_desc;
    }

    public void setOrder_type_desc(String order_type_desc) {
        this.order_type_desc = order_type_desc;
    }

    public Integer getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(Integer trade_type) {
        this.trade_type = trade_type;
    }

    public String getTrade_type_desc() {
        return trade_type_desc;
    }

    public void setTrade_type_desc(String trade_type_desc) {
        this.trade_type_desc = trade_type_desc;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getOrder_status_desc() {
        return order_status_desc;
    }

    public void setOrder_status_desc(String order_status_desc) {
        this.order_status_desc = order_status_desc;
    }

    public Integer getMain_status() {
        return main_status;
    }

    public void setMain_status(Integer main_status) {
        this.main_status = main_status;
    }

    public String getMain_status_desc() {
        return main_status_desc;
    }

    public void setMain_status_desc(String main_status_desc) {
        this.main_status_desc = main_status_desc;
    }

    public Long getPay_time() {
        return pay_time;
    }

    public void setPay_time(Long pay_time) {
        this.pay_time = pay_time;
    }

    public Long getOrder_expire_time() {
        return order_expire_time;
    }

    public void setOrder_expire_time(Long order_expire_time) {
        this.order_expire_time = order_expire_time;
    }

    public Long getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Long finish_time) {
        this.finish_time = finish_time;
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

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Integer getB_type() {
        return b_type;
    }

    public void setB_type(Integer b_type) {
        this.b_type = b_type;
    }

    public String getB_type_desc() {
        return b_type_desc;
    }

    public void setB_type_desc(String b_type_desc) {
        this.b_type_desc = b_type_desc;
    }

    public Integer getSub_b_type() {
        return sub_b_type;
    }

    public void setSub_b_type(Integer sub_b_type) {
        this.sub_b_type = sub_b_type;
    }

    public String getSub_b_type_desc() {
        return sub_b_type_desc;
    }

    public void setSub_b_type_desc(String sub_b_type_desc) {
        this.sub_b_type_desc = sub_b_type_desc;
    }

    public Integer getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Integer order_amount) {
        this.order_amount = order_amount;
    }

    public Integer getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(Integer pay_amount) {
        this.pay_amount = pay_amount;
    }

    public Integer getPost_amount() {
        return post_amount;
    }

    public void setPost_amount(Integer post_amount) {
        this.post_amount = post_amount;
    }

    public Integer getPost_insurance_amount() {
        return post_insurance_amount;
    }

    public void setPost_insurance_amount(Integer post_insurance_amount) {
        this.post_insurance_amount = post_insurance_amount;
    }

    public Integer getModify_amount() {
        return modify_amount;
    }

    public void setModify_amount(Integer modify_amount) {
        this.modify_amount = modify_amount;
    }

    public Integer getModify_post_amount() {
        return modify_post_amount;
    }

    public void setModify_post_amount(Integer modify_post_amount) {
        this.modify_post_amount = modify_post_amount;
    }

    public Integer getPromotion_amount() {
        return promotion_amount;
    }

    public void setPromotion_amount(Integer promotion_amount) {
        this.promotion_amount = promotion_amount;
    }

    public Integer getPromotion_shop_amount() {
        return promotion_shop_amount;
    }

    public void setPromotion_shop_amount(Integer promotion_shop_amount) {
        this.promotion_shop_amount = promotion_shop_amount;
    }

    public Integer getPromotion_platform_amount() {
        return promotion_platform_amount;
    }

    public void setPromotion_platform_amount(Integer promotion_platform_amount) {
        this.promotion_platform_amount = promotion_platform_amount;
    }

    public Integer getShop_cost_amount() {
        return shop_cost_amount;
    }

    public void setShop_cost_amount(Integer shop_cost_amount) {
        this.shop_cost_amount = shop_cost_amount;
    }

    public Integer getPlatform_cost_amount() {
        return platform_cost_amount;
    }

    public void setPlatform_cost_amount(Integer platform_cost_amount) {
        this.platform_cost_amount = platform_cost_amount;
    }

    public Integer getPromotion_talent_amount() {
        return promotion_talent_amount;
    }

    public void setPromotion_talent_amount(Integer promotion_talent_amount) {
        this.promotion_talent_amount = promotion_talent_amount;
    }

    public Integer getPromotion_pay_amount() {
        return promotion_pay_amount;
    }

    public void setPromotion_pay_amount(Integer promotion_pay_amount) {
        this.promotion_pay_amount = promotion_pay_amount;
    }

    public String getPost_tel() {
        return post_tel;
    }

    public void setPost_tel(String post_tel) {
        this.post_tel = post_tel;
    }

    public String getPost_receiver() {
        return post_receiver;
    }

    public void setPost_receiver(String post_receiver) {
        this.post_receiver = post_receiver;
    }

    public Address getPost_addr() {
        return post_addr;
    }

    public void setPost_addr(Address post_addr) {
        this.post_addr = post_addr;
    }

    public Long getExp_ship_time() {
        return exp_ship_time;
    }

    public void setExp_ship_time(Long exp_ship_time) {
        this.exp_ship_time = exp_ship_time;
    }

    public Long getShip_time() {
        return ship_time;
    }

    public void setShip_time(Long ship_time) {
        this.ship_time = ship_time;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }
}
