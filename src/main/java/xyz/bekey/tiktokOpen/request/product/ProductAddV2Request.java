package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductAddV2Parameters;
import xyz.bekey.tiktokOpen.response.product.ProductAddResponse;

public class ProductAddV2Request extends TiktokOpenRequest<ProductAddV2Parameters, ProductAddResponse> {

    public ProductAddV2Request(ProductAddV2Parameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductAddResponse> getResponseType() {
        return ProductAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/addV2";
    }
}
