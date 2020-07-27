package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class ProductIdParameter {

    private Long product_id;
    private Long out_product_id;

    public ProductIdParameter(Long productId, Long outProductId) {
        AssertUtils.isTrue( (productId != null && outProductId == null)
                || (productId == null && outProductId != null), "商品id，和接入方的out_product_id二选一");

        this.product_id = productId;
        this.out_product_id = outProductId;
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public String getOut_product_id() {
        return Objects.toString(out_product_id, null);
    }
}
