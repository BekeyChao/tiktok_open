package xyz.bekey.tiktokOpen.domain.enums;

/**
 * 产品状态
 */
public enum ProductStatus {
    // 状态 (0上架 1下架 2删除)
    OnSale(0), OffSale(1), Deleted(2);

    private int code;

    ProductStatus(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
