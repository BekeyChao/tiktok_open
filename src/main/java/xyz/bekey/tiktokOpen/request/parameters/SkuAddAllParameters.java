package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.Sku;
import xyz.bekey.tiktokOpen.utils.Join;

import java.util.List;

public class SkuAddAllParameters {

    /**
     * 二选一
     */
    private String product_id;

    private String spec_id;

    private String spec_detail_ids;

    private String stock_num;

    private String price;

    private String settlement_price;

    private String out_sku_id;

    private String code;

    public SkuAddAllParameters(Long productId, List<Sku> skus) {
//        this.product_id = product_id.toString();
//        this.spec_id = spec_id.toString();
//        this.out_product_id = productId.getOut_product_id();
        this.product_id = productId.toString();

        StringBuilder spec_ids = new StringBuilder();
        StringBuilder spec_detail_ids = new StringBuilder();
        StringBuilder stock_num = new StringBuilder();
        StringBuilder price = new StringBuilder();
        StringBuilder settlement_price = new StringBuilder();
        StringBuilder code = new StringBuilder();
        StringBuilder out_sku_id = new StringBuilder();
        for (Sku sku : skus) {
            spec_ids.append(sku.getSpec_id()).append("|");
            stock_num.append(sku.getStock_num()).append("|");
            price.append(sku.getPrice()).append("|");
            settlement_price.append(sku.getSettlement_price()).append("|");
            code.append(sku.getCode()).append("|");
            out_sku_id.append(sku.getOut_sku_id()).append("|");

            spec_detail_ids.append(sku.getSpec_detail_ids().stream().map(Object::toString)
                    .collect(Join.VERTICAL)).append("^");
        }

        spec_ids.deleteCharAt(spec_ids.length() - 1);
        spec_detail_ids.deleteCharAt(spec_detail_ids.length() - 1);
        stock_num.deleteCharAt(stock_num.length() - 1);
        price.deleteCharAt(price.length() - 1);
        settlement_price.deleteCharAt(settlement_price.length() - 1);
        code.deleteCharAt(code.length() - 1);
        out_sku_id.deleteCharAt(out_sku_id.length() - 1);

        this.spec_id = spec_ids.toString();
        this.spec_detail_ids = spec_detail_ids.toString();
        this.stock_num = stock_num.toString();
        this.price = price.toString();
        this.settlement_price = settlement_price.toString();
        this.code = code.toString();
        this.out_sku_id = out_sku_id.toString();
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getSpec_id() {
        return spec_id;
    }

    public String getSpec_detail_ids() {
        return spec_detail_ids;
    }

    public String getStock_num() {
        return stock_num;
    }

    public String getPrice() {
        return price;
    }

    public String getSettlement_price() {
        return settlement_price;
    }

    public String getCode() {
        return code;
    }



    public String getOut_sku_id() {
        return out_sku_id;
    }

}
