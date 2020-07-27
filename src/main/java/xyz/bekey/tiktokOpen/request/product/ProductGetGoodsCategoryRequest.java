package xyz.bekey.tiktokOpen.request.product;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CidParameter;
import xyz.bekey.tiktokOpen.response.product.ProductGetGoodsCategoryResponse;

/**
 * 获取商品分类列表
 */
public class ProductGetGoodsCategoryRequest extends TiktokOpenRequest<CidParameter,ProductGetGoodsCategoryResponse> {

    public ProductGetGoodsCategoryRequest(CidParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetGoodsCategoryResponse> getResponseType() {
        return ProductGetGoodsCategoryResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/product/getGoodsCategory";
    }
}
