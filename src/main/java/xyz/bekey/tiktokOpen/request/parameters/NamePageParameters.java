package xyz.bekey.tiktokOpen.request.parameters;

import java.util.Objects;

public class NamePageParameters {
    private Integer page;
    private Integer size;
    private String name;

    public NamePageParameters(String name, Integer page, Integer size) {
        this.page = page;
        this.size = size;
        this.name = name;
    }

    public String getPage() {
        return Objects.toString(page, null);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getSize() {
        return Objects.toString(size, null);
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
