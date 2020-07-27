package xyz.bekey.tiktokOpen.response;

import java.util.List;

public class PageData<T> {

    private Integer all;
    private Integer all_pages;
    private Integer count;
    private Integer current_page;
    private Integer page_size;
    private List<T> data;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    public Integer getAll_pages() {
        return all_pages;
    }

    public void setAll_pages(Integer all_pages) {
        this.all_pages = all_pages;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
