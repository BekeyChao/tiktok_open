package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.Sku;
import xyz.bekey.tiktokOpen.utils.AssertUtils;
import xyz.bekey.tiktokOpen.utils.Join;

import java.util.Objects;

public class SkuAddParameters {

    private Long product_id;

    private Long out_product_id;

    private Long out_sku_id;

    private Long spec_id;

    private String spec_detail_ids;

    private Integer stock_num;

    private Integer price;

    private Integer settlement_price;

    // 可选 商品编码(可以用out_sku_id)
    private String code;

    public SkuAddParameters(Sku sku) {

        AssertUtils.isTrue( (sku.getProduct_id() != null && sku.getOut_product_id() == null)
                || (sku.getProduct_id() == null && sku.getOut_product_id() != null), "商品id，和接入方的out_product_id二选一");
        this.product_id = sku.getProduct_id();
        this.out_product_id = sku.getOut_product_id();

        this.out_sku_id = sku.getOut_sku_id();
        this.spec_id = sku.getSpec_id();

        this.spec_detail_ids = sku.getSpec_detail_ids()
                .stream().map(Objects::toString)
                .collect(Join.VERTICAL);

        this.stock_num = sku.getStock_num();
        this.price = sku.getPrice();
        this.settlement_price = sku.getSettlement_price();
        this.code = sku.getCode();
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public String getOut_product_id() {
        return Objects.toString(out_product_id, null);
    }

    public String getOut_sku_id() {
        return out_sku_id.toString();
    }

    public String getSpec_id() {
        return spec_id.toString();
    }

    public String getSpec_detail_ids() {
        return spec_detail_ids;
    }

    public String getStock_num() {
        return stock_num.toString();
    }

    public String getPrice() {
        return price.toString();
    }

    public String getSettlement_price() {
        return settlement_price.toString();
    }

    public String getCode() {
        return code;
    }
}
