package xyz.bekey.tiktokOpen.request.sku;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.response.sku.SkuListResponse;

public class SkuListRequest extends TiktokOpenRequest<ProductParameter, SkuListResponse> {


    public SkuListRequest(ProductParameter parameter) {
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
