package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuStockParameters;
import xyz.bekey.tiktokOpen.response.sku.SkuSyncStockResponse;

public class SkuSyncStockRequest extends TiktokOpenRequest<SkuStockParameters, SkuSyncStockResponse> {

    public SkuSyncStockRequest(SkuStockParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuSyncStockResponse> getResponseType() {
        return SkuSyncStockResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/syncStock";
    }
}
