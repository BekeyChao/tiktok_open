package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuPriceParameters;
import xyz.bekey.tiktokOpen.response.sku.SkuEditPriceResponse;

public class SkuEditPriceRequest extends TiktokOpenRequest<SkuPriceParameters, SkuEditPriceResponse> {

    public SkuEditPriceRequest(SkuPriceParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuEditPriceResponse> getResponseType() {
        return SkuEditPriceResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/editPrice";
    }
}
