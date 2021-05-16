package xyz.bekey.tiktokOpen.response;

import java.util.List;

public class AftersaleList<T> {
    private List<T> aftersale_list;
    private Integer total;

    public List<T> getAftersale_list() {
        return aftersale_list;
    }

    public void setAftersale_list(List<T> aftersale_list) {
        this.aftersale_list = aftersale_list;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
