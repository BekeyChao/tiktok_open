package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Product;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.utils.Join;

import java.time.LocalDateTime;
import java.util.Objects;

public class ProductAddParameters {

    private String name;

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

    /**
     * 市场价，单位分
     */
    private String market_price;

    /**
     * 售卖价，单位分
     */
    private String discount_price;

    /**
     * 佣金分类，范围为0-99
     */
    private String cos_ratio;

    /**
     * 一级分类id
     * (三个分类级别请确保从属正确)
     */
    private String first_cid;

    /**
     * 二级分类id
     * (三个分类级别请确保从属正确)
     */
    private String second_cid;

    /**
     * 三级分类id
     * (三个分类级别请确保从属正确)
     */
    private String third_cid;

    private PayType pay_type;

    /**
     * 规格id, 要先创建商品通用规格, 如颜色-尺寸
     */
    private String spec_id;

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
     * 属性名称|属性值
     */
    private String product_format;

    /**
     * 商品卖点 可选
     */
    private String usp;

    /**
     * 商家推荐语 可选
     */
    private String recommend_remark;

    /**
     * 额外信息 可选
     */
    private String extra;

    /**
     * 品牌id (请求店铺授权品牌接口获取) (效果即为商品详情页面中的品牌字段)
     * 可选
     */
    private String brand_id;
    /**
     * 可选
     */
    private Integer presell_type;

    private String reduce_type;

    /**
     * 预售结束后，几天发货，可以选择2-30 可选
     */
    private String presell_delay;

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

    public ProductAddParameters(Product product) {
        this.name = product.getName();

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getPic()), "商品轮播图 不能为空");
        this.pic = product.getPic().stream()
                .collect(Join.VERTICAL);

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getDescription()), "商品描述 不能为空");
        this.description = product.getDescriptionUrl().stream()
                .collect(Join.VERTICAL);

        this.out_product_id = product.getOut_product_id().toString();

        this.market_price = product.getMarket_price().toString();
        this.discount_price = product.getDiscount_price().toString();

        this.cos_ratio =product.getCos_ratio().toString();

        this.first_cid = product.getFirst_cid().toString();
        this.second_cid = product.getSecond_cid().toString();
        this.third_cid = product.getThird_cid().toString();

        this.pay_type = product.getPay_type();
        this.spec_id = product.getSpec_id().toString();

        if (product.getSpec_pic() != null
                && product.getSpec_pic().size() > 0) {
            this.spec_pic = product.getSpec_pic().stream()
                    .map(pic -> pic.getSpec_detail_id() + "|" + pic.getPic())
                    .collect(Join.UPUP);
        }

        this.mobile = product.getMobile();
        this.weight = product.getWeight().toString();

        this.product_format = Join.kvJoin(product.getProduct_format());

        this.usp = product.getUsp();
        this.recommend_remark = product.getRecommend_remark();
        this.extra = product.getExtra();

        this.brand_id = Objects.toString(product.getBrand_id(), null);
        this.presell_type = product.getPresell_type();
        this.presell_delay = Objects.toString(product.getPresell_delay(), null);

        this.presell_end_time = product.getPresell_end_time();
        this.delivery_delay_day = Objects.toString(product.getDelivery_delay_day(), null) ;
        this.reduce_type = Objects.toString(product.getReduce_type(), null);
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

    public String getName() {
        return name;
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

    public String getCos_ratio() {
        return cos_ratio;
    }

    public String getFirst_cid() {
        return first_cid;
    }

    public String getSecond_cid() {
        return second_cid;
    }

    public String getThird_cid() {
        return third_cid;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public String getSpec_id() {
        return spec_id;
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

    public String getProduct_format() {
        return product_format;
    }

    public String getUsp() {
        return usp;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public String getExtra() {
        return extra;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public Integer getPresell_type() {
        return presell_type;
    }

    public String getPresell_delay() {
        return presell_delay;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public String getReduce_type() {
        return reduce_type;
    }

    public String getDelivery_delay_day() {
        return delivery_delay_day;
    }
}
