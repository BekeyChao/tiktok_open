package xyz.bekey.tiktokOpen.domain;

public class Category {

    private Long id;

    private String name;
    // 类目级别：1，2，3级类目
    private Integer level;
    //
    private Long parent_id;
    // 	是否是叶子节点
    private Boolean is_leaf;
    // 	是否有效
    private Boolean enable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Boolean getIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(Boolean is_leaf) {
        this.is_leaf = is_leaf;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
