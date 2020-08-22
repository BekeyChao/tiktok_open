package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class ProductParameter {

    private Long product_id;
    private Boolean show_draft;

    public ProductParameter(Long productId, Boolean show_draft) {
        AssertUtils.notNull(productId, "商品ID不能为null");
        this.product_id = productId;
        this.show_draft = show_draft;
    }

    public ProductParameter(Long productId) {
        AssertUtils.notNull(productId, "商品ID不能为null");
        this.product_id = productId;
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public String getShow_draft() {
        return Objects.toString(show_draft, null);
    }
}
