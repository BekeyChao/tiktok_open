package xyz.bekey.tiktokOpen.request.shop;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CidParameter;
import xyz.bekey.tiktokOpen.response.shop.ShopGetShopCategoryResponse;

/**
 * 获取商品分类列表
 * 接口方法名修改 但调用方法一致 仅改调用接口
 */
public class ShopGetShopCategoryRequest extends TiktokOpenRequest<CidParameter, ShopGetShopCategoryResponse> {

    public ShopGetShopCategoryRequest(CidParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ShopGetShopCategoryResponse> getResponseType() {
        return ShopGetShopCategoryResponse.class;
    }

    /**
     *
     * @return
     */
    @Override
    public String getContentPath() {
        return "/shop/getShopCategory";
    }
}
