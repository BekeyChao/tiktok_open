package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductEditParameters;
import xyz.bekey.tiktokOpen.request.parameters.ProductEditV2Parameters;
import xyz.bekey.tiktokOpen.response.product.ProductEditResponse;

public class ProductEditV2Request extends TiktokOpenRequest<ProductEditV2Parameters, ProductEditResponse> {

    public ProductEditV2Request(ProductEditV2Parameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductEditResponse> getResponseType() {
        return ProductEditResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/editV2";
    }
}
