package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Product;
import xyz.bekey.tiktokOpen.domain.Sku;
import xyz.bekey.tiktokOpen.domain.Spec;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.utils.CollectionUtils;
import xyz.bekey.tiktokOpen.utils.Join;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductEditV2Parameters {

    private String product_id;

    // 0-普通，3-虚拟，6玉石闪购，7云闪购
    private String product_type;

    private String category_leaf_id;

//    private String first_cid;
//
//    private String second_cid;
//
//    private String third_cid;

    //属性名称|属性值 之间用|分隔, 多组之间用^分开
    private String product_format;

    // 商品名称，最多30个字符，不能含emoj表情
    private String name;

    // 商家推荐语，不能含emoj表情
    private String recommend_remark;

    // 商品轮播图，多张图片用 "|" 分开，第一张图为主图，最多5张
    private String pic;

    // 商品描述，只支持图片
    private String description;

    private PayType pay_type;

    // 划线价，单位分
    private String market_price;

    // 售价，单位分
    private String discount_price;

    // 减库存类型：1-拍下减库存 2-付款减库存
    private String reduce_type;

    // 同店商品推荐：为空表示使用系统推荐；多个product_id使用“|”分开
    private String assoc_ids;

    private String freight_id;

    private String weight;

    private String weight_unit;

    // 承诺发货时间，单位是天，不传则默认为2天
    private String delivery_delay_day;

    // 发货模式，0-现货发货，1-预售发货，2-阶梯发货，默认0
    private String presell_type;

    // 预售模式下结束后，几天发货/阶梯模式下阶梯发货时间，3-30
    private String presell_delay;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    // 是否支持7天无理由，0不支持，1支持，2支持（拆封后不支持）
    private String supply_7day_return;

    private String mobile;

    private String commit;

    private String brand_id;

    private String remark;

    // 质检报告链接,多个图片以逗号分隔
    private String quality_report;

    // 设置品类资质链接,多个图片以逗号分隔
    private String class_quality;

    // 系统资质列表
    private List quality_list;

    private String out_product_id;

    private String spec_name;

    // 店铺通用规格，能被同类商品通用。多规格用^分隔，规格与规格值用|分隔，多个规格值用,分隔
    private String specs;

    private String spec_prices;

    private String spec_pic;

    private Integer maximum_per_order;

    private Integer limit_per_buyer;

    private Integer minimum_per_order;


    public ProductEditV2Parameters(Product product, Spec spec, List<Sku> skus, boolean commit) {

        this.product_id = Objects.toString(product.getProduct_id(), null);
        this.product_type = Objects.toString(product.getProduct_type(), null);
        this.category_leaf_id = Objects.toString(product.getCategory_leaf_id(), null);
        if (product.getProduct_format() != null ) {
            this.product_format = Join.kvJoin(product.getProduct_format());
        }
        this.name = product.getName();
        this.recommend_remark = product.getRecommend_remark();
        if (CollectionUtils.isPresent(product.getPic())) {
            this.pic = product.getPic().stream()
                    .collect(Join.VERTICAL);
        }
        if (CollectionUtils.isPresent(product.getDescriptionUrl())) {
            this.description = product.getDescriptionUrl().stream()
                    .collect(Join.VERTICAL);
        }
        this.pay_type = product.getPay_type();
        this.market_price = Objects.toString(product.getMarket_price(),null);
        this.discount_price = Objects.toString(product.getDiscount_price(),null);
        this.reduce_type = Objects.toString(product.getReduce_type(), null);
        this.freight_id = Objects.toString(product.getFreight_id(), "0");
        this.weight = Objects.toString(product.getWeight(),null);
        this.weight_unit = "1";
        this.delivery_delay_day = Objects.toString(product.getDelivery_delay_day(), null);
        this.presell_type = Objects.toString(product.getPresell_type(), null);
        this.presell_delay = Objects.toString(product.getPresell_delay(), null);
        this.presell_end_time = product.getPresell_end_time();
        this.supply_7day_return = Objects.toString(product.getSupply_7day_return(),null);
        this.mobile = product.getMobile();
        this.commit = Objects.toString(commit);
        this.brand_id = Objects.toString(product.getBrand_id(), null);
        this.remark = Objects.toString(product.getRemark(), null);
        this.out_product_id = Objects.toString(product.getOut_product_id(), null);
        this.spec_name = spec.getName();
        this.specs = specs;
        this.spec_prices = JSON.toJSONString(skus);
        if (product.getSpec_pic() != null && product.getSpec_pic().size() > 0) {
            this.spec_pic = product.getSpec_pic().stream()
                    .map(pic -> pic.getSpec_detail_id() + "|" + pic.getPic())
                    .collect(Join.COMMA); // 文档说明为"，"分隔
        }
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getCategory_leaf_id() {
        return category_leaf_id;
    }

    public void setCategory_leaf_id(String category_leaf_id) {
        this.category_leaf_id = category_leaf_id;
    }

    public String getProduct_format() {
        return product_format;
    }

    public void setProduct_format(String product_format) {
        this.product_format = product_format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public void setRecommend_remark(String recommend_remark) {
        this.recommend_remark = recommend_remark;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public void setPay_type(PayType pay_type) {
        this.pay_type = pay_type;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(String discount_price) {
        this.discount_price = discount_price;
    }

    public String getReduce_type() {
        return reduce_type;
    }

    public void setReduce_type(String reduce_type) {
        this.reduce_type = reduce_type;
    }

    public String getAssoc_ids() {
        return assoc_ids;
    }

    public void setAssoc_ids(String assoc_ids) {
        this.assoc_ids = assoc_ids;
    }

    public String getFreight_id() {
        return freight_id;
    }

    public void setFreight_id(String freight_id) {
        this.freight_id = freight_id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public String getDelivery_delay_day() {
        return delivery_delay_day;
    }

    public void setDelivery_delay_day(String delivery_delay_day) {
        this.delivery_delay_day = delivery_delay_day;
    }

    public String getPresell_type() {
        return presell_type;
    }

    public void setPresell_type(String presell_type) {
        this.presell_type = presell_type;
    }

    public String getPresell_delay() {
        return presell_delay;
    }

    public void setPresell_delay(String presell_delay) {
        this.presell_delay = presell_delay;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public void setPresell_end_time(LocalDateTime presell_end_time) {
        this.presell_end_time = presell_end_time;
    }

    public String getSupply_7day_return() {
        return supply_7day_return;
    }

    public void setSupply_7day_return(String supply_7day_return) {
        this.supply_7day_return = supply_7day_return;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getQuality_report() {
        return quality_report;
    }

    public void setQuality_report(String quality_report) {
        this.quality_report = quality_report;
    }

    public String getClass_quality() {
        return class_quality;
    }

    public void setClass_quality(String class_quality) {
        this.class_quality = class_quality;
    }

    public List getQuality_list() {
        return quality_list;
    }

    public void setQuality_list(List quality_list) {
        this.quality_list = quality_list;
    }

    public String getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(String out_product_id) {
        this.out_product_id = out_product_id;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getSpec_prices() {
        return spec_prices;
    }

    public void setSpec_prices(String spec_prices) {
        this.spec_prices = spec_prices;
    }

    public String getSpec_pic() {
        return spec_pic;
    }

    public void setSpec_pic(String spec_pic) {
        this.spec_pic = spec_pic;
    }

    public Integer getMaximum_per_order() {
        return maximum_per_order;
    }

    public void setMaximum_per_order(Integer maximum_per_order) {
        this.maximum_per_order = maximum_per_order;
    }

    public Integer getLimit_per_buyer() {
        return limit_per_buyer;
    }

    public void setLimit_per_buyer(Integer limit_per_buyer) {
        this.limit_per_buyer = limit_per_buyer;
    }

    public Integer getMinimum_per_order() {
        return minimum_per_order;
    }

    public void setMinimum_per_order(Integer minimum_per_order) {
        this.minimum_per_order = minimum_per_order;
    }


}
