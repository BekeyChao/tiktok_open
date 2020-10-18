package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuIdParameter;
import xyz.bekey.tiktokOpen.response.sku.SkuDetailResponse;

public class SkuDetailRequest extends TiktokOpenRequest<SkuIdParameter, SkuDetailResponse> {

    public SkuDetailRequest(SkuIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuDetailResponse> getResponseType() {
        return SkuDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/detail";
    }
}
