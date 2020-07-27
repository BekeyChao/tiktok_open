package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductIdParameter;
import xyz.bekey.tiktokOpen.response.sku.SkuListResponse;

public class SkuListRequest extends TiktokOpenRequest<ProductIdParameter, SkuListResponse> {


    public SkuListRequest(ProductIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuListResponse> getResponseType() {
        return SkuListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/list";
    }
}
