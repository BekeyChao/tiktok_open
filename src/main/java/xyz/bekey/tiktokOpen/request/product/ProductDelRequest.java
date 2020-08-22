package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.response.product.ProductDelResponse;

public class ProductDelRequest extends TiktokOpenRequest<ProductParameter, ProductDelResponse> {

    public ProductDelRequest(ProductParameter parameter) {
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
