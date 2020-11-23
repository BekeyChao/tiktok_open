package xyz.bekey.tiktokOpen.request.shop;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NoParameters;
import xyz.bekey.tiktokOpen.response.shop.ShopBrandListResponse;

public class ShopBrandListRequest extends TiktokOpenRequest<NoParameters, ShopBrandListResponse> {

    public ShopBrandListRequest() {
        super(NoParameters.getInstance());
    }

    public ShopBrandListRequest(NoParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ShopBrandListResponse> getResponseType() {
        return ShopBrandListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/shop/brandList";
    }
}
