package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class Sku {

    private Long id;

    private Long product_id;

    private Long out_product_id;
    private String outer_product_id;

    private Long sku_id;

    private Long out_sku_id;
    private String outer_sku_id;

    private Long spec_id;

    private List<Long> spec_detail_ids;

    private Integer stock_num;

    private Integer step_stock_num;

    private Integer price;

    private Integer settlement_price;

    private String supplier_id;

    private String code;

    private Long spec_detail_id1;   //第一级子规格ID（最多三级）
    private Long spec_detail_id2;   //第二级子规格ID
    private Long spec_detail_id3;   //第三级子规格ID（最多三级）
    private String spec_detail_name1;   //第一级子规格名称，比如：黑色
    private String spec_detail_name2;   //第二级子规格名称，比如：大
    private String spec_detail_name3;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getOuter_product_id() {
//        return outer_product_id;
//    }

//    public void setOuter_product_id(String outer_product_id) {
//        this.outer_product_id = outer_product_id;
//    }
//
//    public String getOuter_sku_id() {
//        return outer_sku_id;
//    }
//
//    public void setOuter_sku_id(String outer_sku_id) {
//        this.outer_sku_id = outer_sku_id;
//    }

    public Long getSpec_detail_id1() {
        return spec_detail_id1;
    }

    public void setSpec_detail_id1(Long spec_detail_id1) {
        this.spec_detail_id1 = spec_detail_id1;
    }



    public Long getSpec_detail_id2() {
        return spec_detail_id2;
    }

    public void setSpec_detail_id2(Long spec_detail_id2) {
        this.spec_detail_id2 = spec_detail_id2;
    }

    public Long getSpec_detail_id3() {
        return spec_detail_id3;
    }

    public void setSpec_detail_id3(Long spec_detail_id3) {
        this.spec_detail_id3 = spec_detail_id3;
    }

    public String getSpec_detail_name1() {
        return spec_detail_name1;
    }

    public void setSpec_detail_name1(String spec_detail_name1) {
        this.spec_detail_name1 = spec_detail_name1;
    }

    public String getSpec_detail_name2() {
        return spec_detail_name2;
    }

    public void setSpec_detail_name2(String spec_detail_name2) {
        this.spec_detail_name2 = spec_detail_name2;
    }

    public String getSpec_detail_name3() {
        return spec_detail_name3;
    }

    public void setSpec_detail_name3(String spec_detail_name3) {
        this.spec_detail_name3 = spec_detail_name3;
    }

    public Integer getStep_stock_num() {
        return step_stock_num;
    }

    public void setStep_stock_num(Integer step_stock_num) {
        this.step_stock_num = step_stock_num;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }
}
