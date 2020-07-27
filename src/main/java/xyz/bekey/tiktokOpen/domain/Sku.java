package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class Sku {

    private Long product_id;

    private Long out_product_id;

    private Long sku_id;

    private Long out_sku_id;

    private Long spec_id;

    private List<Long> spec_detail_ids;

    private Integer stock_num;

    private Integer price;

    private Integer settlement_price;

    private String code;

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public Long getOut_sku_id() {
        return out_sku_id;
    }

    public void setOut_sku_id(Long out_sku_id) {
        this.out_sku_id = out_sku_id;
    }

    public List<Long> getSpec_detail_ids() {
        return spec_detail_ids;
    }

    public void setSpec_detail_ids(List<Long> spec_detail_ids) {
        this.spec_detail_ids = spec_detail_ids;
    }

    public Integer getStock_num() {
        return stock_num;
    }

    public void setStock_num(Integer stock_num) {
        this.stock_num = stock_num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSettlement_price() {
        return settlement_price;
    }

    public void setSettlement_price(Integer settlement_price) {
        this.settlement_price = settlement_price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(Long out_product_id) {
        this.out_product_id = out_product_id;
    }

    public Long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }
}
