package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class ProductProperty {
    private Long property_id;
    private String property_name;
    private Boolean required;
    private List<NameValue> options;

    public Long getProperty_id() {
        return property_id;
    }

    public void setProperty_id(Long property_id) {
        this.property_id = property_id;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public List<NameValue> getOptions() {
        return options;
    }

    public void setOptions(List<NameValue> options) {
        this.options = options;
    }
}
