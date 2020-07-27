package xyz.bekey.tiktokOpen.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 规格
 */
public class Spec {

    /**
     * id : 31
     * spec_id : 0
     * name : 颜色
     * pid : 0
     * is_leaf : 0
     * values : [{"id":32,"spec_id":8,"name":"黑色","pid":31,"is_leaf":1,"status":0},{"id":33,"spec_id":8,"name":"白色","pid":31,"is_leaf":1,"status":0},{"id":34,"spec_id":8,"name":"黄色","pid":31,"is_leaf":1,"status":0}]
     */

    private Long id;
    private Long spec_id;
    private String name;
    // 父规格ID
    private Long pid;
    private Integer is_leaf;

    private List<Spec> values;

    @JSONField(name = "Specs")
    private List<Spec> Specs;

    private Integer status;

    public Spec() {
    }

    public Spec(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(Integer is_leaf) {
        this.is_leaf = is_leaf;
    }

    public List<Spec> getValues() {
        return values;
    }

    public void setValues(List<Spec> values) {
        this.values = values;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Spec> getSpecs() {
        return Specs;
    }

    public void setSpecs(List<Spec> specs) {
        Specs = specs;
    }
}
