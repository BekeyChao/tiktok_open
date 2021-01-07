package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.response.product.ProductSetOnLineResponse;

public class ProductSetOnLineRequest extends TiktokOpenRequest<ProductParameter, ProductSetOnLineResponse> {

    public ProductSetOnLineRequest(ProductParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductSetOnLineResponse> getResponseType() {
        return ProductSetOnLineResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/setOnline";
    }
}
