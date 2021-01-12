package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class SkuStockParameters {
    // 	外部仓库ID
    private Long out_warehouse_id;
    // 	供应商ID
    private Long supplier_id;

    // true表示增量库存，false表示全量库存，默认为false
    private Boolean incremental;

    // 幂等ID， incremental=true的时候必填
    private Long idempotent_id;

    private Long sku_id;

    private int stock_num;

    private Integer step_stock_num;

    public SkuStockParameters(Long skuId, int stock_num, Boolean incremental, Long idempotent_id) {
        AssertUtils.isTrue(stock_num >= 0, "库存数量不能小于0");
        AssertUtils.notNull(skuId, "sku id not be null");
        this.incremental = incremental;
        this.idempotent_id = idempotent_id;
        this.sku_id = skuId;
        this.stock_num = stock_num;
    }

    public SkuStockParameters(Long skuId, int stock_num, Integer step_stock_num, Boolean incremental, Long idempotent_id) {
        this(skuId, stock_num, incremental, idempotent_id);
        AssertUtils.isTrue(step_stock_num == null || step_stock_num >= 0, "阶梯库存数量不能小于0");
        this.step_stock_num = step_stock_num;
    }

    public SkuStockParameters(Long skuId, int stock_num, Integer step_stock_num, Boolean incremental, Long idempotent_id,
                              Long out_warehouse_id, Long supplier_id) {
        this(skuId, stock_num, step_stock_num, incremental, idempotent_id);
        this.out_warehouse_id = out_warehouse_id;
        this.supplier_id = supplier_id;
    }

    public String getOut_warehouse_id() {
        return Objects.toString(out_warehouse_id, null);
    }

    public String getSupplier_id() {
        return Objects.toString(supplier_id, null);
    }

    public String getIncremental() {
        return Objects.toString(incremental, null);
    }

    public String getIdempotent_id() {
        return Objects.toString(idempotent_id, null);
    }

    public String getStep_stock_num() {
        return Objects.toString(step_stock_num, null);
    }

    public String getSku_id() {
        return Objects.toString(sku_id, null);
    }

    public String getStock_num() {
        return stock_num + "";
    }
}

