package xyz.bekey.tiktokOpen.response;

import java.util.List;

public class PageList<T> {

    // 页数，从0开始
    private Integer page;

    // 单页大小
    private Integer size;

    // 总订单数
    private Integer total;

    // 订单信息
    private List<T> shop_order_list;

    // 订单详情
    private T shop_order_detail;

    private List<T> list;
//
//    private Integer count;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }

    public T getShop_order_detail() {
        return shop_order_detail;
    }

    public void setShop_order_detail(T shop_order_detail) {
        this.shop_order_detail = shop_order_detail;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getShop_order_list() {
        return shop_order_list;
    }

    public void setShop_order_list(List<T> shop_order_list) {
        this.shop_order_list = shop_order_list;
    }
}
