package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductEditParameters;
import xyz.bekey.tiktokOpen.response.product.ProductEditResponse;

public class ProductEditRequest extends TiktokOpenRequest<ProductEditParameters, ProductEditResponse> {

    public ProductEditRequest(ProductEditParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductEditResponse> getResponseType() {
        return ProductEditResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/edit";
    }
}
