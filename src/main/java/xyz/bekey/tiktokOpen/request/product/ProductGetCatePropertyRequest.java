package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CategoryLeafIdParameter;
import xyz.bekey.tiktokOpen.response.product.ProductGetCatePropertyResponse;

public class ProductGetCatePropertyRequest extends TiktokOpenRequest<CategoryLeafIdParameter, ProductGetCatePropertyResponse> {

    public ProductGetCatePropertyRequest(CategoryLeafIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetCatePropertyResponse> getResponseType() {
        return ProductGetCatePropertyResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/getCateProperty";
    }
}
