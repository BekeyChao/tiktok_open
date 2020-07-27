package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuAddParameters;
import xyz.bekey.tiktokOpen.response.sku.SkuAddResponse;

public class SkuAddRequest extends TiktokOpenRequest<SkuAddParameters, SkuAddResponse> {

    public SkuAddRequest(SkuAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddResponse> getResponseType() {
        return SkuAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/add";
    }
}
