package xyz.bekey.tiktokOpen.request.parameters;

public class SkuIdParameter {

    private Long sku_id;

    public SkuIdParameter(Long sku_id) {
        this.sku_id = sku_id;
    }

    public String getSku_id() {
        return sku_id + "";
    }
}
