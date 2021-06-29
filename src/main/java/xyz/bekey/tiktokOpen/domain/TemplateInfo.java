package xyz.bekey.tiktokOpen.domain;

public class TemplateInfo {

    private String template_id;

    private String template_code;

    private String template_name;

    private String template_url;

    private String version;

    // 1​-一联单 2-二联单
    private String template_type;

    // 模板预览
    private String perview_url;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getTemplate_code() {
        return template_code;
    }

    public void setTemplate_code(String template_code) {
        this.template_code = template_code;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public String getTemplate_url() {
        return template_url;
    }

    public void setTemplate_url(String template_url) {
        this.template_url = template_url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTemplate_type() {
        return template_type;
    }

    public void setTemplate_type(String template_type) {
        this.template_type = template_type;
    }

    public String getPerview_url() {
        return perview_url;
    }

    public void setPerview_url(String perview_url) {
        this.perview_url = perview_url;
    }
}
