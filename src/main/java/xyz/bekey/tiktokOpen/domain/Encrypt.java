package xyz.bekey.tiktokOpen.domain;

public class Encrypt {

    // 明文
    private String plain_text;

    // 鉴权ID
    private String auth_id;

    // 是否支持密文索引
    private Boolean is_support_index;

    // 加密类型；1地址加密 2姓名加密 3电话加密
    private Integer sensitive_type;

    public Encrypt(String plain_text, String auth_id, Boolean is_support_index, Integer sensitive_type) {
        this.plain_text = plain_text;
        this.auth_id = auth_id;
        this.is_support_index = is_support_index;
        this.sensitive_type = sensitive_type;
    }

    public String getPlain_text() {
        return plain_text;
    }

    public void setPlain_text(String plain_text) {
        this.plain_text = plain_text;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    public Boolean getIs_support_index() {
        return is_support_index;
    }

    public void setIs_support_index(Boolean is_support_index) {
        this.is_support_index = is_support_index;
    }

    public Integer getSensitive_type() {
        return sensitive_type;
    }

    public void setSensitive_type(Integer sensitive_type) {
        this.sensitive_type = sensitive_type;
    }
}
