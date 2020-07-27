package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class SkuCodeParameters {

    private Long product_id;

    private Long out_product_id;

    private Long out_sku_id;

    private Long sku_id;

    private String code;

    public SkuCodeParameters(String code, Long productId, Long outProductId, Long skuId, Long outSkuId) {
        AssertUtils.notNull(code, "sku code 不能为空");
        this.code = code;

        AssertUtils.isTrue( (productId != null && outProductId == null)
                || (productId == null && outProductId != null), "商品id，和接入方的out_product_id二选一");

        this.product_id = productId;
        this.out_product_id = outProductId;

        AssertUtils.isTrue( (skuId != null && outSkuId == null)
                || (skuId == null && outSkuId != null), "sku_id，和接入方的out_sku_id二选一");

        this.sku_id = skuId;
        this.out_sku_id = out_product_id;
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public String getOut_product_id() {
        return Objects.toString(out_product_id, null);
    }

    public String getOut_sku_id() {
        return Objects.toString(out_sku_id, null);
    }

    public String getSku_id() {
        return Objects.toString(sku_id, null);
    }

    public String getPrice() {
        return code;
    }
}

