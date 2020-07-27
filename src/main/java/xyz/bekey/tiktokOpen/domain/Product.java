package xyz.bekey.tiktokOpen.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.enums.CheckStatus;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.domain.enums.PresellType;
import xyz.bekey.tiktokOpen.domain.enums.ProductStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Product {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime create_time;

    private String img;

    private Integer settlement_price;
    // 0上架 1下架
    private ProductStatus status;

    private CheckStatus check_status;

    // 没有意义的字段 通产品ID一致
    @JSONField(serialize = false, deserialize = false)
    private String product_id_str;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime update_time;

    private Long open_user_id;

    // 是否创建过商品 0未创建 1已创建
    private Integer is_create;

    // 下单减库存 付款减库存
    private Integer reduce_type;

    /**
     * 发货时间
     */
    private Integer delivery_delay_day;

    private List<Spec> specs;

    private List<Sku> spec_prices;

    /**
     * 抖音小店的description
     */
//    @JSONField(deserialize = false)
    private String description;

    private Long product_id;

    private String name;

    /**
     * 商品轮播图
     */
    private List<String> pic;


    /**
     * 商品描述图 url合集
     */
    public List<String> descriptionUrl;

    /**
     * 外部商品id,接入方的商品id (需为数字字符串, max = int64)
     */
    private Long out_product_id;

    /**
     * 市场价，单位分
     */
    private Integer market_price;

    /**
     * 售卖价，单位分
     */
    private Integer discount_price;

    /**
     *  佣金分类，范围为0-99
     */
    private Integer cos_ratio;

    /**
     * 一级分类id
     * (三个分类级别请确保从属正确)
     */
    private Long first_cid;

    /**
     * 二级分类id
     * (三个分类级别请确保从属正确)
     */
    private Long second_cid;

    /**
     * 三级分类id
     * (三个分类级别请确保从属正确)
     */
    private Long third_cid;

    private PayType pay_type;

    /**
     * 规格id, 要先创建商品通用规格, 如颜色-尺寸
     */
    private Long spec_id;

    private List<SpecPic> spec_pic;

    /**
     * 客服号码
     */
    private String mobile;

    /**
     * 商品重量 (单位:克)
     * 范围: 10克 - 9999990克
     */
    private Integer weight;

    /**
     * 属性名称|属性值
     */
    private Map<String, String> product_format;

    /**
     * 商品卖点
     */
    private String usp;

    /**
     * 商家推荐语
     */
    private String recommend_remark;

    /**
     * 额外信息
     */
    private String extra;

    /**
     * 品牌id (请求店铺授权品牌接口获取) (效果即为商品详情页面中的品牌字段)
     */
    private Long brand_id;

    private PresellType presell_type;

    /**
     * 预售结束后，几天发货，可以选择2-30
     */
    private Integer presell_delay;

    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPic() {
        return pic;
    }

    public void setPic(List<String> pic) {
        this.pic = pic;
    }

    public List<String> getDescriptionUrl() {
        return descriptionUrl;
    }

    public void setDescriptionUrl(List<String> descriptionUrl) {
        this.descriptionUrl = descriptionUrl;
    }

    public Long getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(Long out_product_id) {
        this.out_product_id = out_product_id;
    }

    public Integer getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Integer market_price) {
        this.market_price = market_price;
    }

    public Integer getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(Integer discount_price) {
        this.discount_price = discount_price;
    }

    public Integer getCos_ratio() {
        return cos_ratio;
    }

    public void setCos_ratio(Integer cos_ratio) {
        this.cos_ratio = cos_ratio;
    }

    public Long getFirst_cid() {
        return first_cid;
    }

    public void setFirst_cid(Long first_cid) {
        this.first_cid = first_cid;
    }

    public Long getSecond_cid() {
        return second_cid;
    }

    public void setSecond_cid(Long second_cid) {
        this.second_cid = second_cid;
    }

    public Long getThird_cid() {
        return third_cid;
    }

    public void setThird_cid(Long third_cid) {
        this.third_cid = third_cid;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public void setPay_type(PayType pay_type) {
        this.pay_type = pay_type;
    }

    public Long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }

    public List<SpecPic> getSpec_pic() {
        return spec_pic;
    }

    @JSONField(name = "spec_pics")
    public void setSpec_pic(List<SpecPic> spec_pic) {
        this.spec_pic = spec_pic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getOpen_user_id() {
        return open_user_id;
    }

    public void setOpen_user_id(Long open_user_id) {
        this.open_user_id = open_user_id;
    }

    public Map<String, String> getProduct_format() {
        return product_format;
    }

    public void setProduct_format(String product_format) {
//        this.product_format = product_format;
        if (product_format != null) {
            this.product_format = JSON.parseObject(product_format, Map.class);
        }

    }

    public String getUsp() {
        return usp;
    }

    public void setUsp(String usp) {
        this.usp = usp;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public void setRecommend_remark(String recommend_remark) {
        this.recommend_remark = recommend_remark;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public PresellType getPresell_type() {
        return presell_type;
    }

    public void setPresell_type(PresellType presell_type) {
        this.presell_type = presell_type;
    }

    public Integer getPresell_delay() {
        return presell_delay;
    }

    public void setPresell_delay(Integer presell_delay) {
        this.presell_delay = presell_delay;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public void setPresell_end_time(LocalDateTime presell_end_time) {
        this.presell_end_time = presell_end_time;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getSettlement_price() {
        return settlement_price;
    }

    public void setSettlement_price(Integer settlement_price) {
        this.settlement_price = settlement_price;
    }

    public CheckStatus getCheck_status() {
        return check_status;
    }

    public void setCheck_status(CheckStatus check_status) {
        this.check_status = check_status;
    }

    public String getProduct_id_str() {
        return product_id_str;
    }

    public void setProduct_id_str(String product_id_str) {
        this.product_id_str = product_id_str;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Integer getIs_create() {
        return is_create;
    }

    public void setIs_create(Integer is_create) {
        this.is_create = is_create;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    public List<Sku> getSpec_prices() {
        return spec_prices;
    }

    public void setSpec_prices(List<Sku> spec_prices) {
        this.spec_prices = spec_prices;
    }

    public Integer getDelivery_delay_day() {
        return delivery_delay_day;
    }

    public void setDelivery_delay_day(Integer delivery_delay_day) {
        this.delivery_delay_day = delivery_delay_day;
    }

    public Integer getReduce_type() {
        return reduce_type;
    }

    public void setReduce_type(Integer reduce_type) {
        this.reduce_type = reduce_type;
    }
}
