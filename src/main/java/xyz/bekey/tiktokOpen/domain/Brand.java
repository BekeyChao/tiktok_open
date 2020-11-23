package xyz.bekey.tiktokOpen.domain;

public class Brand {

    private Long id;

    private String brand_chinese_name;

    private String brand_english_name;

    private String brand_reg_num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand_chinese_name() {
        return brand_chinese_name;
    }

    public void setBrand_chinese_name(String brand_chinese_name) {
        this.brand_chinese_name = brand_chinese_name;
    }

    public String getBrand_english_name() {
        return brand_english_name;
    }

    public void setBrand_english_name(String brand_english_name) {
        this.brand_english_name = brand_english_name;
    }

    public String getBrand_reg_num() {
        return brand_reg_num;
    }

    public void setBrand_reg_num(String brand_reg_num) {
        this.brand_reg_num = brand_reg_num;
    }
}
