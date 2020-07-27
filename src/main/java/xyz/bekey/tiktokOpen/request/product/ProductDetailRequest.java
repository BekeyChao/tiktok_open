package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductIdParameter;
import xyz.bekey.tiktokOpen.response.product.ProductDetailResponse;

public class ProductDetailRequest extends TiktokOpenRequest<ProductIdParameter, ProductDetailResponse> {
    public ProductDetailRequest(ProductIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductDetailResponse> getResponseType() {
        return ProductDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/detail";
    }
}
