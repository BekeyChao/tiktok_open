package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Product;
import xyz.bekey.tiktokOpen.domain.Sku;
import xyz.bekey.tiktokOpen.domain.Spec;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.utils.AssertUtils;
import xyz.bekey.tiktokOpen.utils.CollectionUtils;
import xyz.bekey.tiktokOpen.utils.Join;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class ProductAddV2Parameters {

    private String name;
    // 0-普通，3-虚拟，6玉石闪购，7云闪购
    private String product_type;

    /**
     * 商品轮播图
     */
    private String pic;

    /**
     * 商品描述图
     */
    private String description;

    /**
     * 外部商品id,接入方的商品id (需为数字字符串, max = int64)
     */
    private String out_product_id;
    private String outer_product_id;

    /**
     * 市场价，单位分
     */
    private String market_price;

    /**
     * 售卖价，单位分
     */
    private String discount_price;

    private PayType pay_type;

    private String spec_pic;

    /**
     * 客服号码
     */
    private String mobile;

    /**
     * 商品重量 (单位:克)
     * 范围: 10克 - 9999990克
     */
    private String weight;

    /**
     * 重量单位，0-kg, 1-g
     */
    private String weight_unit;

    private String supply_7day_return;

    private String commit;

    /**
     * 属性名称|属性值
     */
    private String product_format;

    /**
     * 商家推荐语 可选
     */
    private String recommend_remark;

    /**
     * 品牌id (请求店铺授权品牌接口获取) (效果即为商品详情页面中的品牌字段)
     * 可选
     */
    private String brand_id;
    /**
     * 可选
     */
    private String presell_type;

    /**
     * 减库存类型：1-拍下减库存 2-付款减库存
     */
    private String reduce_type;

    private String remark;

    /**
     * 同店商品推荐：为空表示使用系统推荐；多个product_id使用“|”分开
     */
    private String assoc_ids;

    /**
     * 预售结束后，几天发货，可以选择2-30 可选
     */
    private String presell_delay;

    /**
     * 运费模板id，传0表示包邮
     */
    private String freight_id;

    /**
     * 承诺发货时间 可选值为: 2、3、5、7、10、15 可选
     */
    private String delivery_delay_day;

    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天 可选
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    // 商品创建和编辑操作支持设置质检报告链接,多个图片以逗号分隔
    private String quality_report;
    // 商品创建和编辑操作支持设置品类资质链接,多个图片以逗号分隔
    private String class_quality;

    private String category_leaf_id;

    private String spec_name;

    private String specs;

    private String spec_prices;

    public ProductAddV2Parameters(Product product, Spec spec, List<Sku> skus, boolean commit) {
        this.name = product.getName();
        this.pic = product.getPic().stream()
                .collect(Join.VERTICAL);
        this.description = product.getDescriptionUrl().stream()
                .collect(Join.VERTICAL);
        this.out_product_id = Objects.toString(product.getOut_product_id(), null);
        this.market_price = product.getMarket_price().toString();
        this.discount_price = product.getDiscount_price().toString();

//        this.first_cid = product.getFirst_cid().toString();
//        this.second_cid = product.getSecond_cid().toString();
//        this.third_cid = product.getThird_cid().toString();
        this.category_leaf_id = product.getCategory_leaf_id().toString();

        this.pay_type = product.getPay_type();
        if (product.getSpec_pic() != null
                && product.getSpec_pic().size() > 0) {
            this.spec_pic = product.getSpec_pic().stream()
                    .map(pic -> pic.getSpec_detail_id() + "|" + pic.getPic())
                    .collect(Join.UPUP);
        }
        this.mobile = product.getMobile();
        this.weight = product.getWeight().toString();
        this.product_format = Join.kvJoin(product.getProduct_format());
        this.recommend_remark = product.getRecommend_remark();
        this.brand_id = Objects.toString(product.getBrand_id(), null);
        this.presell_type = Objects.toString(product.getPresell_type(), null);
        this.presell_delay = Objects.toString(product.getPresell_delay(), null);
        this.presell_end_time = product.getPresell_end_time();
        this.delivery_delay_day = Objects.toString(product.getDelivery_delay_day(), null);
        this.reduce_type = Objects.toString(product.getReduce_type(), null);

        //
        this.product_type = Objects.toString(product.getProduct_type(), "0");
        this.commit = Objects.toString(commit);
        this.remark = Objects.toString(product.getRemark(), null);
        this.weight_unit = "1";
        this.supply_7day_return = product.getSupply_7day_return().toString();
        this.freight_id = Objects.toString(product.getFreight_id(), "0");

        // spec
        this.spec_name = spec.getName();
        AssertUtils.isTrue(CollectionUtils.isPresent(spec.getSpecs()), "规格不可为空");
        List<Spec> specBeans = spec.getSpecs();
        AssertUtils.isTrue(specBeans.size() <= 3, "单次最多三组规格");

        String specs = specBeans.stream().map(child -> {
            if (CollectionUtils.isPresent(child.getValues())) {
                return child.getName() + "|" +
                        child.getValues().stream()
                                .map(Spec::getName).collect(Join.COMMA);
            }
            return child.getName() + "|" + child.getName();
        }).collect(Join.UPUP);

        this.specs = specs;

        this.spec_prices = JSON.toJSONString(skus);
        this.outer_product_id =
                Objects.toString(product.getOut_product_id(), product.getOuter_product_id());

    }

    public void setQuality_report(String quality_report) {
        this.quality_report = quality_report;
    }

    public void setClass_quality(String class_quality) {
        this.class_quality = class_quality;
    }

    public void setCategory_leaf_id(String category_leaf_id) {
        this.category_leaf_id = category_leaf_id;
    }

    public void setAssoc_ids(String assoc_ids) {
        this.assoc_ids = assoc_ids;
    }

    public String getName() {
        return name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public String getPic() {
        return pic;
    }

    public String getDescription() {
        return description;
    }

    public String getOut_product_id() {
        return out_product_id;
    }

    public String getMarket_price() {
        return market_price;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public String getSpec_pic() {
        return spec_pic;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWeight() {
        return weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public String getSupply_7day_return() {
        return supply_7day_return;
    }

    public String getCommit() {
        return commit;
    }

    public String getProduct_format() {
        return product_format;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public String getPresell_type() {
        return presell_type;
    }

    public String getReduce_type() {
        return reduce_type;
    }

    public String getRemark() {
        return remark;
    }

    public String getAssoc_ids() {
        return assoc_ids;
    }

    public String getPresell_delay() {
        return presell_delay;
    }

    public String getFreight_id() {
        return freight_id;
    }

    public String getDelivery_delay_day() {
        return delivery_delay_day;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public String getQuality_report() {
        return quality_report;
    }

    public String getClass_quality() {
        return class_quality;
    }

    public String getCategory_leaf_id() {
        return category_leaf_id;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public String getSpecs() {
        return specs;
    }

    public String getSpec_prices() {
        return spec_prices;
    }

    public String getOuter_product_id() {
        if (getOut_product_id() != null) {
            return getOut_product_id();
        }
        return outer_product_id;
    }
}
