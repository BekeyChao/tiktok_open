package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductAddParameters;
import xyz.bekey.tiktokOpen.response.product.ProductAddResponse;

public class ProductAddRequest extends TiktokOpenRequest<ProductAddParameters,ProductAddResponse> {

    public ProductAddRequest(ProductAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductAddResponse> getResponseType() {
        return ProductAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/add";
    }
}
