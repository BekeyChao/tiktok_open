package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuAddAllParameters;
import xyz.bekey.tiktokOpen.response.sku.SkuAddAllResponse;

public class SkuAddAllRequest extends TiktokOpenRequest<SkuAddAllParameters, SkuAddAllResponse> {

    public SkuAddAllRequest(SkuAddAllParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddAllResponse> getResponseType() {
        return SkuAddAllResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/addAll";
    }
}
