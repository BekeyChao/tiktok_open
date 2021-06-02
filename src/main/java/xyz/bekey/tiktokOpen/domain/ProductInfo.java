package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class ProductInfo {

    private String product_name;

    private Integer price;

    private String outer_sku_id;

    private Long sku_id;

    private List<NameValue> sku_specs;

    private Integer product_count;

    private Long product_id;

    private String sku_order_id;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOuter_sku_id() {
        return outer_sku_id;
    }

    public void setOuter_sku_id(String outer_sku_id) {
        this.outer_sku_id = outer_sku_id;
    }

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public List<NameValue> getSku_specs() {
        return sku_specs;
    }

    public void setSku_specs(List<NameValue> sku_specs) {
        this.sku_specs = sku_specs;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getSku_order_id() {
        return sku_order_id;
    }

    public void setSku_order_id(String sku_order_id) {
        this.sku_order_id = sku_order_id;
    }
}
