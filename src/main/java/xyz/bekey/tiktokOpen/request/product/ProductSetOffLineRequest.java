package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.response.product.ProductSetOffLineResponse;

public class ProductSetOffLineRequest extends TiktokOpenRequest<ProductParameter, ProductSetOffLineResponse> {

    public ProductSetOffLineRequest(ProductParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductSetOffLineResponse> getResponseType() {
        return ProductSetOffLineResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/setOffline";
    }
}
