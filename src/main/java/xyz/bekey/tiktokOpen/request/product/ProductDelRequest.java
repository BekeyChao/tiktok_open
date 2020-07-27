package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductIdParameter;
import xyz.bekey.tiktokOpen.response.product.ProductDelResponse;

public class ProductDelRequest extends TiktokOpenRequest<ProductIdParameter, ProductDelResponse> {

    public ProductDelRequest(ProductIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductDelResponse> getResponseType() {
        return ProductDelResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/del";
    }
}
