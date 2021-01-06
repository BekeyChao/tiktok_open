package xyz.bekey.tiktokOpen.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class ListPage<T> {

    private Integer count;

    @JSONField(name = "List")
    private List<T> List;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public java.util.List<T> getList() {
        return List;
    }

    public void setList(java.util.List<T> list) {
        List = list;
    }
}
