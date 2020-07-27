package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SkuCodeParameters;
import xyz.bekey.tiktokOpen.response.sku.SkuEditCodeResponse;

public class SkuEditCodeRequest extends TiktokOpenRequest<SkuCodeParameters, SkuEditCodeResponse> {

    public SkuEditCodeRequest(SkuCodeParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuEditCodeResponse> getResponseType() {
        return SkuEditCodeResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/editCode";
    }
}
