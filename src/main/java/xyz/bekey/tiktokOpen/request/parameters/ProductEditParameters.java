package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Product;
import xyz.bekey.tiktokOpen.domain.enums.PayType;
import xyz.bekey.tiktokOpen.domain.enums.PresellType;
import xyz.bekey.tiktokOpen.utils.AssertUtils;
import xyz.bekey.tiktokOpen.utils.CollectionUtils;
import xyz.bekey.tiktokOpen.utils.Join;

import java.time.LocalDateTime;
import java.util.Objects;

public class ProductEditParameters {

    /**
     * 产品ID， 三方ID， 二选一
     */
    private String product_id;
    private String out_product_id;

    /**
     * 可选
     */
    private String name;

    /**
     * 商品轮播图 可选
     */
    private String pic;

    /**
     * 商品描述图 可选
     */
    private String description;

    /**
     * 一级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String first_cid;

    /**
     * 二级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String second_cid;

    /**
     * 三级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String third_cid;

    /**
     * 可选
     */
    private PayType pay_type;

    /**
     * 规格id, 要先创建商品通用规格, 如颜色-尺寸 可选
     */
    private String spec_id;

    /**
     * 客服号码 可选
     */
    private String mobile;

    /**
     * 属性名称|属性值 可选
     */
    private String product_format;

    /**
     * 可选
     */
    private PresellType presell_type;

    /**
     * 预售结束后，几天发货，可以选择2-30 可选
     */
    private String presell_delay;

    /**
     * "1"：编辑后立即提交审核；"2"：编辑后仅保存，不提审
     */
    private String commit;

    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天 可选
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    public ProductEditParameters(Product product, int commit) {
        Long productId = product.getProduct_id();
        Long outProductId = product.getOut_product_id();
        AssertUtils.isTrue( (productId != null && outProductId == null)
            || (productId == null && outProductId != null), "商品id，和接入方的out_product_id二选一");

        this.product_id = Objects.toString(productId, null);
        this.out_product_id = Objects.toString(outProductId, null);

        this.name = product.getName();

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getPic()), "商品轮播图 不能为空");
        if (CollectionUtils.isPresent(product.getPic())) {
            this.pic = product.getPic().stream()
                    .collect(Join.VERTICAL);
        }


        if (CollectionUtils.isPresent(product.getDescriptionUrl())) {
            this.description = product.getDescriptionUrl().stream()
                    .collect(Join.VERTICAL);
        }

        if (product.getFirst_cid() != null) {
            this.first_cid = product.getFirst_cid().toString();
            this.second_cid = product.getSecond_cid().toString();
            this.third_cid = product.getThird_cid().toString();
        }


        this.pay_type = product.getPay_type();
        this.spec_id = Objects.toString(product.getSpec_id(), null);

        this.mobile = product.getMobile();

        if (product.getProduct_format() != null ) {
            this.product_format = Join.kvJoin(product.getProduct_format());
        }

        this.presell_type = product.getPresell_type();
        this.presell_delay = Objects.toString(product.getPresell_delay(), null);
        this.presell_end_time = product.getPresell_end_time();

        this.commit = commit + "";
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getOut_product_id() {
        return out_product_id;
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

    public String getMobile() {
        return mobile;
    }

    public String getProduct_format() {
        return product_format;
    }

    public String getCommit() {
        return commit;
    }

    public PresellType getPresell_type() {
        return presell_type;
    }

    public String getPresell_delay() {
        return presell_delay;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }
}
