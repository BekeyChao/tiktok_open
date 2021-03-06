package xyz.bekey.tiktokOpen.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.enums.CheckStatus;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.domain.enums.ProductStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Product {

//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String create_time;

    private String img;

    // 已废弃
//    private Integer settlement_price;
    // 0上架 1下架
    private ProductStatus status;

    private CheckStatus check_status;

    // 没有意义的字段 通产品ID一致
    @JSONField(serialize = false, deserialize = false)
    private String product_id_str;

//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String update_time;

    private Long open_user_id;

    // 是否创建过商品 0未创建 1已创建 已废弃
//    private Integer is_create;

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
    private String outer_product_id;

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

    private Integer presell_type;

    /**
     * 预售结束后，几天发货，可以选择2-30
     */
    private Integer presell_delay;

    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    // 0-普通，3-虚拟，6玉石闪购，7云闪购
    private Integer product_type;

    private Long freight_id;
    private String remark;
    private Integer supply_7day_return;
    // 仅作传参使用 叶子类目ID 代替firstCid second_cid thirdCid
    private Long category_leaf_id;

    private CategoryDetail category_detail;

    public static class CategoryDetail {
        private Long first_cid; // 一级类目ID
        private Long second_cid; // 二级类目ID
        private Long third_cid; // 三级类目ID
        private Long fourth_cid; // 四级类目ID
        private String first_name; // 一级类目名称
        private String second_name; // 二级类目名称
        private String third_name; // 三级类目名称
        private String fourth_name; // 四级类目名称

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

        public Long getFourth_cid() {
            return fourth_cid;
        }

        public void setFourth_cid(Long fourth_cid) {
            this.fourth_cid = fourth_cid;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

        public String getThird_name() {
            return third_name;
        }

        public void setThird_name(String third_name) {
            this.third_name = third_name;
        }

        public String getFourth_name() {
            return fourth_name;
        }

        public void setFourth_name(String fourth_name) {
            this.fourth_name = fourth_name;
        }
    }

    public Long getCategory_leaf_id() {
        return category_leaf_id;
    }

    public String getOuter_product_id() {
        return outer_product_id;
    }

    public void setOuter_product_id(String outer_product_id) {
        this.outer_product_id = outer_product_id;
    }

    public void setCategory_leaf_id(Long category_leaf_id) {
        this.category_leaf_id = category_leaf_id;
    }

    public CategoryDetail getCategory_detail() {
        return category_detail;
    }

    public void setCategory_detail(CategoryDetail category_detail) {
        this.category_detail = category_detail;
    }

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

    public Integer getPresell_type() {
        return presell_type;
    }

    public void setPresell_type(Integer presell_type) {
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

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
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

    public Integer getProduct_type() {
        return product_type;
    }

    public void setProduct_type(Integer product_type) {
        this.product_type = product_type;
    }

    public Long getFreight_id() {
        return freight_id;
    }

    public void setFreight_id(Long freight_id) {
        this.freight_id = freight_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSupply_7day_return() {
        return supply_7day_return;
    }

    public void setSupply_7day_return(Integer supply_7day_return) {
        this.supply_7day_return = supply_7day_return;
    }
}
