package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.enums.CheckStatus;

import java.util.Objects;

public class ProductListParameters {

    private Integer page;

    private Integer size;
    /**
     * 可选 0上架 1下架
     */
    private Integer status;

    /**
     * 可选 审核状态
     */
    private CheckStatus check_status;

    public ProductListParameters(Integer page, Integer size, Integer status, CheckStatus check_status) {
        this.page = page;
        this.size = size;
        this.status = status;
        this.check_status = check_status;
    }

    public ProductListParameters(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public String getPage() {
        return page.toString();
    }

    public String getSize() {
        return size.toString();
    }

    public String getStatus() {
        return Objects.toString(status, null);
    }

    public CheckStatus getCheck_status() {
        return check_status;
    }
}
