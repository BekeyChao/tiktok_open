package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductListParameters;
import xyz.bekey.tiktokOpen.response.product.ProductListResponse;

public class ProductListRequest extends TiktokOpenRequest<ProductListParameters, ProductListResponse> {

    public ProductListRequest(ProductListParameters parameter) {
        super(parameter);
        setLogLevel(0);
    }

    @Override
    public Class<ProductListResponse> getResponseType() {
        return ProductListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/list";
    }
}
