package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.response.product.ProductDetailResponse;

public class ProductDetailRequest extends TiktokOpenRequest<ProductParameter, ProductDetailResponse> {
    public ProductDetailRequest(ProductParameter parameter) {
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
